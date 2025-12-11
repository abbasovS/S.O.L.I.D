package com.spring.security.solid.o;

public class OpenClosed {
    public interface PaymentMethod {
        void pay(double amount);
    }

    public static class CreditCardPayment implements PaymentMethod {
        public void pay(double amount) {
            System.out.println("Paid with credit card: " + amount);
        }
    }

    public static class PayPalPayment implements PaymentMethod {
        public void pay(double amount) {
            System.out.println("Paid with PayPal: " + amount);
        }
    }

    public static class PaymentService {
        public void processPayment(PaymentMethod method, double amount) {
            method.pay(amount);
        }
    }

}
