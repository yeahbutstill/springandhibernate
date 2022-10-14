package com.yeahbutstill.alloffshitfuckingdemo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:6603/mysqlpzn-db?useSSL=false&serverTimezone=UTC";
        String user = "yukbelajar";
        String pass = "PNSJkxXvVNDAhePMuExTBuRR";

        try {
            System.out.println("Connecting to database: " + jdbcUrl);

            Connection myConn =
                    DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("Connection successful!!!");

        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }

}



