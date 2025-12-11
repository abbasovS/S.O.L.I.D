package com.spring.security.solid.s;

public class SingleResponsibility {
    public class user {
        private String username;
        private String email;
    }

    public class UserRepository {
        public void save(user user) {
            System.out.println("User saved: " + user);
        }
    }

    public class EmailService {
        public void sendWelcomeEmail(user user) {
            System.out.println("Welcome email sent to: " + user);
        }
    }

}
