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
            this.connection = DriverManager.getConnection(URL,LOGIN,PASSWORD);
            this.statement = this.connection.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("You are Connected");
        return true;
    }

    /** The method closing the connection to the database. */
    public void close() {System.out.println("Connection Stopped");}

    private int executeUpdate(String query){
        int rowAffected = 0;
        try {
            Statement statement = this.connection.createStatement();

            rowAffected = this.statement.executeUpdate(query);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return rowAffected;
    }

    /** The method entering values in the database. */
    public void insertEntity(){
        open();
        executeUpdate(QueryEntity.getQueryInsert());
        executeUpdate(QueryEntity.getQueryInsert());
        executeUpdate(QueryEntity.getQueryInsert());
        executeUpdate(QueryEntity.getQueryInsert());
        close();
    }

    public void selectEntity(){
        try {
            open();
            String query = "CALL mapById(1)";
            stmt = connection.prepareCall(query);
            //stmt.setInt(0, 1);
            stmt.execute();
            //stmt.getInt(0);
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

    /*public void selectEntity2(){
        try{
        statement = this.connection.prepareCall("{call mapbyid()}");
        ResultSet rs = statement.execute();

        while (rs.next()){
            System.out.println(rs.getInt("id"));
        }
    }catch (SQLException e){
            e.printStackTrace();
        }
    }*/
}
