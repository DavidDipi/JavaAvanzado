package co.edu.sena.javaavanzado.model.repository;

import co.edu.sena.javaavanzado.model.User;
import co.edu.sena.javaavanzado.util.ConnectionPool;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class UserRepositoryImpl implements Repository<User>{

    private String sql = null;
    @Override
    public List<User> listAllObj() throws SQLException {
        sql = "SELECT u.user_id, u.user_firstname, u.user_lastname, u.user_email, u.user_password FROM users_tbl u ORDER BY u.user_lastname, u.user_firstname";
        List<User> users = new ArrayList<>();
        try (Connection conn = ConnectionPool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)
        ){
            while ( rs.next() ) {
                User u = createObj(rs);
                users.add( u );
            }
        }
        return users;
    }

    @Override
    public User byIdObj(Integer id) throws SQLException {
        sql = "SELECT u.user_id, u.user_firstname, u.user_lastname, u.user_email, u.user_password FROM users_tbl u WHERE u.user_id = ?";
        User user = null;

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)
        ){
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()){
                if (rs.next()){
                    user = createObj(rs);
                }
            }
        }
        return user;
    }

    @Override
    public Integer saveObj(User user) throws SQLException {
        int rowsAffected = 0;

        if (user.getUser_id() != null && user.getUser_id() > 0){
            sql = "UPDATE users_tbl SET user_firstname = ?, user_lastname = ?, user_email = ?, " + "user_password = aes_encrypt(?, '$2a$12$3a3uFEhL7z0EDERQe3j4UeO/hBG3H1xfatquQURBcMZnCPcRWGga6')" +
                    "WHERE user_id = ?";
        } else {
            sql = "INSERT INTO users_tbl (user_firstname, user_lastname, user_email, user_password)" +
                    "VALUES(UPPER(?), UPPER(?), LOWER(?), " +
                    "aes_encrypt(?, '$2a$12$3a3uFEhL7z0EDERQe3j4UeO/hBG3H1xfatquQURBcMZnCPcRWGga6'))";
        }

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, user.getUser_firstname());
            ps.setString(2, user.getUser_lastname());
            ps.setString(3, user.getUser_email());
            ps.setString(4, user.getUser_password());
            if (user.getUser_id() != null && user.getUser_id() > 0){
                ps.setInt(5, user.getUser_id());
            }

            rowsAffected = ps.executeUpdate();
        }
        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql = "DELETE FROM users_tbl WHERE user_id = ?";
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)
        ){
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    @Override
    public User createObj(ResultSet rs) throws SQLException {
        User user = new User();
        user.setUser_id(rs.getInt("user_id"));
        user.setUser_firstname(rs.getString("user_firstname"));
        user.setUser_lastname(rs.getString("user_lastname"));
        user.setUser_email(rs.getString("user_email"));
        user.setUser_password(rs.getString("user_password"));
        return user;
    }
}
