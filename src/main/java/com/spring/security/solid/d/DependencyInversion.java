package com.spring.security.solid.d;

public class DependencyInversion {
    interface MessageSender {
        void sendMessage(String message);
    }

    static class EmailSender implements MessageSender {
        public void sendMessage(String message) {
            System.out.println("Email sent: " + message);
        }
    }

    static class SmsSender implements MessageSender {
        public void sendMessage(String message) {
            System.out.println("SMS sent: " + message);
        }
    }

    static class NotificationService {
        private final MessageSender sender;

        public NotificationService(MessageSender sender) {
            this.sender = sender;
        }

        public void notifyUser(String msg) {
            sender.sendMessage(msg);
        }
    }

}
