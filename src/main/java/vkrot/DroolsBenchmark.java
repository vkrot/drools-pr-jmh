package vkrot;

import java.beans.PropertyChangeListener;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Thread)
public class DroolsBenchmark {
    private final ClasspathSessionFactory sessionFactory = new ClasspathSessionFactory("test.drl");

    static {
        System.err.println(
                Pojo10.class.getMethods().length
        );
        System.err.println(
                Pojo30.class.getMethods().length
        );
    }

    @Benchmark
    public void testPojo10WithoutPropertyChangeListener(Blackhole bh) {
        Pojo10 p = new Pojo10();
        sessionFactory.get().execute(p);
        bh.consume(p);
    }

    @Benchmark
    public void testPojo30WithoutPropertyChangeListener(Blackhole bh) {
        Pojo30 p = new Pojo30();
        sessionFactory.get().execute(p);
        bh.consume(p);
    }

    @Benchmark
    public void testPojo100WithoutPropertyChangeListener(Blackhole bh) {
        Pojo100 p = new Pojo100();
        sessionFactory.get().execute(p);
        bh.consume(p);
    }

    @Benchmark
    public void testPojo10WitPropertyChangeListener(Blackhole bh) {
        Pojo10WithPropertyListener p = new Pojo10WithPropertyListener();
        sessionFactory.get().execute(p);
        bh.consume(p);
    }

    @Benchmark
    public void testPojo30WithPropertyChangeListener(Blackhole bh) {
        Pojo30WithPropertyListener p = new Pojo30WithPropertyListener();
        sessionFactory.get().execute(p);
        bh.consume(p);
    }

    @Benchmark
    public void testPojo100WithPropertyChangeListener(Blackhole bh) {
        Pojo100WithPropertyListener p = new Pojo100WithPropertyListener();
        sessionFactory.get().execute(p);
        bh.consume(p);
    }

    public interface Pojo {}

    public static class Pojo10 implements Pojo {
        public void test() {};
        public void test1() {};
        public void test2() {};
        public void test3() {};
        public void test4() {};
        public void test5() {};
        public void test6() {};
        public void test7() {};
        public void test8() {};
        public void test9() {};
    }

    // don't extend Pojo10, we want to addPropertyChangeListener be last method
    public static class Pojo10WithPropertyListener implements Pojo {
        public void test() {};
        public void test1() {};
        public void test2() {};
        public void test3() {};
        public void test4() {};
        public void test5() {};
        public void test6() {};
        public void test7() {};
        public void test8() {};
        public void test9() {};
        public void addPropertyChangeListener(PropertyChangeListener listener) {
            test();
        }
    }

    public static class Pojo30 implements Pojo {
        public void test() {};
        public void test1() {};
        public void test2() {};
        public void test3() {};
        public void test4() {};
        public void test5() {};
        public void test6() {};
        public void test7() {};
        public void test8() {};
        public void test9() {};
        public void test10() {};
        public void test11() {};
        public void test12() {};
        public void test13() {};
        public void test14() {};
        public void test15() {};
        public void test16() {};
        public void test17() {};
        public void test18() {};
        public void test19() {};
        public void test20() {};
        public void test21() {};
        public void test22() {};
        public void test23() {};
        public void test24() {};
        public void test25() {};
        public void test26() {};
        public void test27() {};
    }

    public static class Pojo30WithPropertyListener implements Pojo {
        public void test() {};
        public void test1() {};
        public void test2() {};
        public void test3() {};
        public void test4() {};
        public void test5() {};
        public void test6() {};
        public void test7() {};
        public void test8() {};
        public void test9() {};
        public void test10() {};
        public void test11() {};
        public void test12() {};
        public void test13() {};
        public void test14() {};
        public void test15() {};
        public void test16() {};
        public void test17() {};
        public void test18() {};
        public void test19() {};
        public void test20() {};
        public void test21() {};
        public void test22() {};
        public void test23() {};
        public void test24() {};
        public void test25() {};
        public void test26() {};
        public void test27() {};
        public void addPropertyChangeListener(PropertyChangeListener listener) {
            test();
        }
    }

    public static class Pojo100 implements Pojo {
        public void test() {};
        public void test1() {};
        public void test2() {};
        public void test3() {};
        public void test4() {};
        public void test5() {};
        public void test6() {};
        public void test7() {};
        public void test8() {};
        public void test9() {};
        public void test10() {};
        public void test11() {};
        public void test12() {};
        public void test13() {};
        public void test14() {};
        public void test15() {};
        public void test16() {};
        public void test17() {};
        public void test18() {};
        public void test19() {};
        public void test20() {};
        public void test21() {};
        public void test22() {};
        public void test23() {};
        public void test24() {};
        public void test25() {};
        public void test26() {};
        public void test27() {};

        public void aTest() {};
        public void aTest1() {};
        public void aTest2() {};
        public void aTest3() {};
        public void aTest4() {};
        public void aTest5() {};
        public void aTest6() {};
        public void aTest7() {};
        public void aTest8() {};
        public void aTest9() {};
        public void aTest10() {};
        public void aTest11() {};
        public void aTest12() {};
        public void aTest13() {};
        public void aTest14() {};
        public void aTest15() {};
        public void aTest16() {};
        public void aTest17() {};
        public void aTest18() {};
        public void aTest19() {};
        public void aTest20() {};
        public void aTest21() {};
        public void aTest22() {};
        public void aTest23() {};
        public void aTest24() {};
        public void aTest25() {};
        public void aTest26() {};
        public void aTest27() {};

        public void bTest() {};
        public void bTest1() {};
        public void bTest2() {};
        public void bTest3() {};
        public void bTest4() {};
        public void bTest5() {};
        public void bTest6() {};
        public void bTest7() {};
        public void bTest8() {};
        public void bTest9() {};
        public void bTest10() {};
        public void bTest11() {};
        public void bTest12() {};
        public void bTest13() {};
        public void bTest14() {};
        public void bTest15() {};
        public void bTest16() {};
        public void bTest17() {};
        public void bTest18() {};
        public void bTest19() {};
        public void bTest20() {};
        public void bTest21() {};
        public void bTest22() {};
        public void bTest23() {};
        public void bTest24() {};
        public void bTest25() {};
        public void bTest26() {};
        public void bTest27() {};

        public void cTest() {};
        public void cTest1() {};
        public void cTest2() {};
        public void cTest3() {};
        public void cTest4() {};
        public void cTest5() {};
        public void cTest6() {};
        public void cTest7() {};
        public void cTest8() {};
        public void cTest9() {};
    }

    public static class Pojo100WithPropertyListener implements Pojo {
        public void test() {};
        public void test1() {};
        public void test2() {};
        public void test3() {};
        public void test4() {};
        public void test5() {};
        public void test6() {};
        public void test7() {};
        public void test8() {};
        public void test9() {};
        public void test10() {};
        public void test11() {};
        public void test12() {};
        public void test13() {};
        public void test14() {};
        public void test15() {};
        public void test16() {};
        public void test17() {};
        public void test18() {};
        public void test19() {};
        public void test20() {};
        public void test21() {};
        public void test22() {};
        public void test23() {};
        public void test24() {};
        public void test25() {};
        public void test26() {};
        public void test27() {};

        public void aTest() {};
        public void aTest1() {};
        public void aTest2() {};
        public void aTest3() {};
        public void aTest4() {};
        public void aTest5() {};
        public void aTest6() {};
        public void aTest7() {};
        public void aTest8() {};
        public void aTest9() {};
        public void aTest10() {};
        public void aTest11() {};
        public void aTest12() {};
        public void aTest13() {};
        public void aTest14() {};
        public void aTest15() {};
        public void aTest16() {};
        public void aTest17() {};
        public void aTest18() {};
        public void aTest19() {};
        public void aTest20() {};
        public void aTest21() {};
        public void aTest22() {};
        public void aTest23() {};
        public void aTest24() {};
        public void aTest25() {};
        public void aTest26() {};
        public void aTest27() {};

        public void bTest() {};
        public void bTest1() {};
        public void bTest2() {};
        public void bTest3() {};
        public void bTest4() {};
        public void bTest5() {};
        public void bTest6() {};
        public void bTest7() {};
        public void bTest8() {};
        public void bTest9() {};
        public void bTest10() {};
        public void bTest11() {};
        public void bTest12() {};
        public void bTest13() {};
        public void bTest14() {};
        public void bTest15() {};
        public void bTest16() {};
        public void bTest17() {};
        public void bTest18() {};
        public void bTest19() {};
        public void bTest20() {};
        public void bTest21() {};
        public void bTest22() {};
        public void bTest23() {};
        public void bTest24() {};
        public void bTest25() {};
        public void bTest26() {};
        public void bTest27() {};
        public void cTest() {};
        public void cTest1() {};
        public void cTest2() {};
        public void cTest3() {};
        public void cTest4() {};
        public void cTest5() {};
        public void cTest6() {};
        public void cTest7() {};
        public void cTest8() {};
        public void cTest9() {};
        public void addPropertyChangeListener(PropertyChangeListener listener) {
            aTest();
        }
    }
}
