package org.example.patterns.design;

import java.util.Objects;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return Objects.requireNonNullElseGet(instance, () -> instance = new Singleton());
    }

    public void hello(){
        System.out.println("Hello!, olá!, Hola!");
    }

}
