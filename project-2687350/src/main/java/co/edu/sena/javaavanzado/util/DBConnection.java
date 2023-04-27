package co.edu.sena.javaavanzado.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://aws.connect.psdb.cloud/my-app?serverTimezone=America/Bogota";
    private static final String USER = "hjdlysezzcax6nyn65jv";

    private static final String PASS = "pscale_pw_QkrC900pRwazKV1F94oDQEfNr9H6D3tV0diAEnESqVw";

    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException {
        if( pool == null ){
            pool = new BasicDataSource();
            pool.setUrl(URL);
            pool.setUsername(USER);
            pool.setPassword(PASS);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);
        }

        return pool;
    }

    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }
}
