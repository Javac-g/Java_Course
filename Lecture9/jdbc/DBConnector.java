package Lecture9.jdbc;

import java.sql.*;
import java.util.List;

public class DBConnector {

    private static final String url = "jdbc:postgresql://localhost:5433/touragency";

    private static final String user = "postgres";

    private static final String password = "postgres";
    private static final String countryNamesQuery = "SELECT name FROM countries";

    //Connection statement
    public static List<String> getCountriesNames() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        try{
            con = DriverManager.getConnection(url, user, password);
            stmt = con.prepareStatement(countryNamesQuery);
            res = stmt.executeQuery();


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }if (res != null) {
                try {
                    res.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }


}
