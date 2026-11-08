package bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DbUtil {

    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";

    private DbUtil() {
    }

    public static Connection getConnection() throws SQLException {
        String user = System.getenv("CONSOLEBANK_DB_USER");
        String password = System.getenv("CONSOLEBANK_DB_PASSWORD");

        if (user == null || user.isBlank() || password == null || password.isEmpty()) {
            throw new SQLException("CONSOLEBANK_DB_USER와 CONSOLEBANK_DB_PASSWORD를 설정하세요.");
        }

        return DriverManager.getConnection(URL, user, password);
    }
}