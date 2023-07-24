package org.example;

import java.sql.*;

public class Main {


    private static final String connectionUrl = "jdbc:mysql://localhost:3306/ngta";

    private static final String USER_SELECT_STRING = "select * from user";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("com.mysql.jdbc.Driver");


        try (Connection con = DriverManager.getConnection(connectionUrl, "root", "Sametbegg1")) {


            Statement statement = con.createStatement();


            ResultSet result = statement.executeQuery(USER_SELECT_STRING);


            while (result.next()) {

                System.out.print(result.getString(1) +  "  " );
                System.out.print(result.getString(2)  + "  "  );
                System.out.println(result.getString(3));
            }

        } catch (SQLException sqlException) {
            System.out.println(" SQL HATASI");
        }


    }
}