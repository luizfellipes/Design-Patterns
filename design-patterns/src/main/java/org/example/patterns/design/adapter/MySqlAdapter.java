package org.example.patterns.design.adapter;

import org.example.patterns.design.commands.MySqlCommands;
import org.example.patterns.design.dbinterface.DbAdapter;

public class MySqlAdapter implements DbAdapter {

    private MySqlCommands mysql;

    public MySqlAdapter(MySqlCommands mysql) {
        this.mysql = mysql;
    }

    @Override
    public void insert() {
        mysql.insertMySql();
    }

    @Override
    public void update() {
        mysql.updateMySql();
    }

    @Override
    public void delete() {
        mysql.deleteMySql();
    }
}
