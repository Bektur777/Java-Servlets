package com.ubei.http.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {

    private static final String URL_KEY = PropertiesUtil.get("db.url");

    private static final String USER_KEY= PropertiesUtil.get("db.user");

    private static final String PASSWORD_KEY = PropertiesUtil.get("db.password");

    private ConnectionManager() {
    }

    public static Connection get() {
        try {
            return DriverManager.getConnection(URL_KEY, USER_KEY, PASSWORD_KEY);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
