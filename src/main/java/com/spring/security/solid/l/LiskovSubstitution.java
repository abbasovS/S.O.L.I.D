package com.spring.security.solid.l;

public class LiskovSubstitution {
    static class Bird {
        public void fly() {
            System.out.println("Bird is flying");
        }
    }

    static class Sparrow extends Bird {
        @Override
        public void fly() {
            System.out.println("Sparrow is flying");
        }
    }

    public static class BirdService {
        public void makeBirdFly(Bird bird) {
            bird.fly();
        }
    }

}
