package org.example.patterns.design;


import org.example.patterns.design.adapter.MySqlAdapter;
import org.example.patterns.design.commands.MySqlCommands;
import org.example.patterns.design.commands.OracleCommands;

public class Main {
    public static void main(String[] args) {
        OracleCommands oracleCommands = new OracleCommands();
        oracleCommands.insert();

        MySqlAdapter mySqlAdapter = new MySqlAdapter(new MySqlCommands());
        mySqlAdapter.insert();

    }
}