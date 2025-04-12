package baitap0304;

import java.sql.*;

public class AuthService {
    public boolean login(String email) throws SQLException {
        String sql = "SELECT * FROM Student WHERE email = ?";
        try (Connection conn = Database.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        }
    }

    public void logout() {
        // Implement logout functionality if needed
    }
}