package model.dao;

/** The Query Entity class
 *
 * @author Group 8
 */
public abstract class QueryEntity {

    /**
     * Gets the sql query
     * @return sql query
     */
    public static String getQueryInsert() {
        return "INSERT INTO \"map\" (\"width\", \"height\")" +
                "VALUES (40,22);";
    }

    public static String getQuerySelectAll(){
        return "SELECT * FROM \"map\";";
    }

    /*public static String getQuerySelect() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM jpublankproject;");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String width = resultSet.getString("width");
                String height = resultSet.getString("height");
                System.out.println(id + "; " + width + "; " + height);
            }catch(SQLException e){
                throw new RuntimeException(e);
            }
        }
    }*/
}
