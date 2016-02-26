package vkrot;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Message;
import org.kie.api.io.KieResources;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

public class ClasspathSessionFactory {
    private final String rulesFile;
    private final KieContainer container;

    public ClasspathSessionFactory(String rulesFile) {
        this.rulesFile = rulesFile;
        this.container = createContainer();
    }

    private KieContainer createContainer() {
        KieServices kieServices = KieServices.Factory.get();
        KieResources kieResources = kieServices.getResources();
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();

        Resource resource = kieResources.newClassPathResource(rulesFile);
        kieFileSystem.write(rulesFile, resource);

        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem).buildAll();

        if (kb.getResults().hasMessages(Message.Level.ERROR)) {
            throw new RuntimeException("Build Errors:\n" + kb.getResults().toString());
        }

        return kieServices.newKieContainer(kb.getKieModule().getReleaseId());
    }

    public StatelessKieSession get() {
        return container.newStatelessKieSession();
    }
}