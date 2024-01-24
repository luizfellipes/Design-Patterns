package org.example.patterns.design;

public class Framework {

    private String name;
    private String db;
    private String dbUser;
    private String dbPassword;
    private String dbHost;
    private boolean webpack;
    private boolean tests;
    private boolean full;

    public Framework() {
    }

    public Framework(String name, String db, String dbUser, String dbPassword, String dbHost, boolean webpack, boolean tests, boolean full) {
        this.name = name;
        this.db = db;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
        this.dbHost = dbHost;
        this.webpack = webpack;
        this.tests = tests;
        this.full = full;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getDbHost() {
        return dbHost;
    }

    public void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }

    public boolean isWebpack() {
        return webpack;
    }

    public void setWebpack(boolean webpack) {
        this.webpack = webpack;
    }

    public boolean isTests() {
        return tests;
    }

    public void setTests(boolean tests) {
        this.tests = tests;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    @Override
    public String toString() {
        return "Framework{" +
                "name='" + name + '\'' +
                ", db='" + db + '\'' +
                ", dbUser='" + dbUser + '\'' +
                ", dbPassword='" + dbPassword + '\'' +
                ", dbHost='" + dbHost + '\'' +
                ", webpack=" + webpack +
                ", tests=" + tests +
                ", full=" + full +
                '}';
    }
}
