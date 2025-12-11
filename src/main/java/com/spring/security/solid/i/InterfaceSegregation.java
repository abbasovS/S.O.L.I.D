package com.spring.security.solid.i;

public class InterfaceSegregation {
    interface Workable {
        void work();
    }

    interface Eatable {
        void eat();
    }

    static class Human implements Workable, Eatable {
        public void work() {
            System.out.println("Human working");
        }

        public void eat() {
            System.out.println("Human eating");
        }
    }

    static class Robot implements Workable {
        public void work() {
            System.out.println("Robot working");
        }
    }

}
