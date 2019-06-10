package com.company.user.domain.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NUserDao extends UserDao{
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver"); // Driver Load
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/study?serverTimezone=UTC", "student", "111111");
    }
}
