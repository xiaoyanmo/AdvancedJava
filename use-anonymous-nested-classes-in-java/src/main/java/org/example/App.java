package org.example;

/**
 * Hello world!
 */
public class App {
    public static abstract class AnonymousNestedClass{
        public abstract void work1();
        public abstract void work2();
    }
    public static void main(String[] args) {
        AnonymousNestedClass anonymousNestedClass = new AnonymousNestedClass() {

            @Override
            public void work1() {
                System.out.println("Work 1");
            }

            @Override
            public void work2() {
                System.out.println("Work 2");
            }
        };
        anonymousNestedClass.work1();
        anonymousNestedClass.work2();
    }
}
