package org.akhq.utils;

public class Credentials {
    private static String _username;
    private static String _password;

    public static String getUserName() {
        return _username;
    }

    public static void setUserName(String username) {
        _username = username;
    }

    public static String getPassword() {
        return _password;
    }

    public static void setPassword(String password) {
        _password = password;
    }

    public static void clear() {
        _username = null;
        _password = null;
    }
}
