package org.example.patterns.design.commands;

import org.example.patterns.design.dbinterface.DbAdapter;

public class OracleCommands implements DbAdapter {


    @Override
    public void insert() {
        System.out.println("Insert from Oracle");
    }

    @Override
    public void update() {
        System.out.println("Update from Oracle");
    }

    @Override
    public void delete() {
        System.out.println("Delete from Oracle");
    }

}
