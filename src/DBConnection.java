import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/perpustakaan";
    private static final String USER = "root"; // XAMPP default
    private static final String PASS = "";     // kosongkan jika tidak ada password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
