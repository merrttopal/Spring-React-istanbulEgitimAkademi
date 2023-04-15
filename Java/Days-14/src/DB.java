import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost/java_se";
    private final String username = "root";
    private final String password = "";

    private Connection connection = null;

    public Connection getConnect() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Connection Success!");
            }
        } catch (Exception exception) {
            System.err.println("Connection error: "+ exception);
        }
        return connection;
    }

    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection Close!");
            }
        } catch (Exception ex) {
            System.err.println("Close error: "+ ex);
        }
    }

}