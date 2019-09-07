
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JavaConnect {

    static Connection con = null;
    static String url = "jdbc:mysql://localhost:3306/library";
    static String user = "root";
    static String password = "123456";

    public static Connection connectDB() {
        try {
            con = DriverManager.getConnection(url, user, password);
          
        } catch (SQLException e) {
           e.getMessage();
        }
        return con;
    }

}
