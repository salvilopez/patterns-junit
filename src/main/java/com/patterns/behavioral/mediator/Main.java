package com.patterns.behavioral.mediator;

public class Main {

    public static void main(String[] args) {


        ChatMediator chat = new Telegram();

        AbstractUser user1 = new User(chat, "Juan");
        AbstractUser user2 = new User(chat, "Alan");
        AbstractUser user3 = new User(chat, "Patricia");
        AbstractUser user4 = new User(chat, "Antonio");

        user1.send("Hola buenas!");

        user2.send("Hasta luego!");
    }

}
