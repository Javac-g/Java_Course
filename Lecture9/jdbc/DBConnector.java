package Lecture9.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private static final String url = "jdbc:postgresql://localhost:5433/touragency";

    private static final String user = "postgres";

    private static final String password = "postgres";

    //Connection statement
    public static void main(String...args) throws SQLException {

        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println(con);
    }


}
