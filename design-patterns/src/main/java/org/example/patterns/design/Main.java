package org.example.patterns.design;


public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.hello();

    }
}