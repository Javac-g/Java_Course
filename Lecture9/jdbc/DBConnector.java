package Lecture9.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnector {

    private static final String url = "jdbc:postgresql://localhost:5433/touragency";

    private static final String user = "postgres";

    private static final String password = "postgres";
    private static final String countryNamesQuery = "SELECT name FROM countries";
    private static Connection con = null;
    private static PreparedStatement stmt = null;
    private static ResultSet res = null;


    //Connection statement
    public static List<String> getCountriesNames() {
        List<String>countries = new ArrayList<>();
        try{
            con = DriverManager.getConnection(url, user, password);
            stmt = con.prepareStatement(countryNamesQuery);
            res = stmt.executeQuery();
            while (res.next()){
                countries.add(res.getString(1));
            }


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
        return countries;

    }

    public void AddClient(String firstname, String lastname,String middlename,String ibannumber,int discount){
        try {
            String addClientQuery = "INSERT INTO clients (firstname, lastname, middlename, ibannumber, discount) VALUES ('"+ firstname+"','"+lastname+"','"+middlename+"','"+discount+"')";
            con = DriverManager.getConnection(url, user, password);
            stmt = con.prepareStatement(addClientQuery);
            res = stmt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
