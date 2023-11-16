package model.dao;

import java.sql.*;

/**
 * The DataBase Connection Class
 *
 * @author Group 8
 */
public class DBConnection {

    /** The DataBase URL. */
    private static String URL = "jdbc:postgresql://localhost:5432/boulderdash_8?autoReconnect=true&useSSL=false&maxReconnects=10";

    /** The DataBase LOGIN. */
    private static String LOGIN = "postgres";

    /** The DataBase password. */
    private static String PASSWORD = "tsdareen";

    private Connection connection;
    private Statement statement;
    CallableStatement stmt;


    /** The function opening the connection to the database. */
    public Boolean open() {
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL,LOGIN,PASSWORD);
            statement = connection.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("You are Connected");
        return true;
    }

    public void close() {System.out.println("Connection Stopped");}

    private int executeUpdate(String query){
        int rowAffected = 0;
        try {
            Statement statement = connection.createStatement();

            rowAffected = statement.executeUpdate(query);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return rowAffected;
    }

    public ResultSet executeQuery(String query){
        return null;
    }

    public void insertEntity(){
        this.open();
        this.executeUpdate(QueryEntity.getQueryInsert());
        this.executeUpdate(QueryEntity.getQueryInsert());
        this.executeUpdate(QueryEntity.getQueryInsert());
        this.executeUpdate(QueryEntity.getQueryInsert());
        this.close();
    }

    public void selectEntity(){
        try {
            open();
            String query = "CALL mapById(5)";
            stmt = connection.prepareCall(query);
            //stmt.setInt(index, value);
            stmt.execute();
            System.out.println("Procedure executed succesfully");
            close();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try{
                if (stmt != null){
                    stmt.close();}
                if (connection != null){
                    connection.close();}
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}