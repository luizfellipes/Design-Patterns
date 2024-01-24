package org.example.patterns.design;

public class FrameworkFullBuilder implements FrameworkBuilderInterface {

    private final Framework framework;

    public FrameworkFullBuilder() {
        this.framework = new Framework();
        buildName();
        buildDb();
        buildWebpack();
        buildTests();
        buildFull();
    }

    public Framework getFramework() {
        return framework;
    }

    public void buildName() {
        this.framework.setName("My Project");
    }

    public void buildDb() {
        this.framework.setDb("MySql");
        this.framework.setDbUser("root");
        this.framework.setDbPassword("toor");
        this.framework.setDbHost("localhost:8080");
    }

    public void buildWebpack() {
        this.framework.setWebpack(true);
    }

    public void buildTests() {
        this.framework.setTests(true);
    }

    public void buildFull() {
        this.framework.setFull(true);
    }

}
