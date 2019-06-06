package com.company.user.domain.main;

import java.sql.*;

public abstract class UserDao {
    /*
     JDBC를 이용하는 작업의 일반적인 순서
     1. DB 연결을 위한 Connection을 가져온다.
     2. SQL을 담은 Statement(PreparedStatement) 만든다.
     3. 만들어진 Statement를 실행한다.
     4. 조회의 경우 SQL 쿼리의 실행 결과를 ResultSet으로 받아서 정보를 저장할 오브젝트(User)에 옮겨줌.
     5. 예외처리(메소드 밖으로 던지는 게 제일 좋음)
     */

    public void add(User user) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        // 얘 뭐하는 놈이었더라....
        PreparedStatement preparedStatement =
                connection.prepareStatement("insert into users(name, password) values (?, ?)");
//        preparedStatement.setInt(1, user.getId()); auto increment 가 디니까 굳이 넣을 필요가 없음
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getPassword());

        preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.close();
    }

//    private Connection getConnection() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver"); // Driver Load
//        return DriverManager.getConnection("jdbc:mysql://localhost:3306/study?serverTimezone=UTC", "student", "111111");
//    }

    public abstract Connection getConnection() throws ClassNotFoundException, SQLException;

    public User get(Integer id) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement =
                connection.prepareStatement("select * from users where id=?");
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();

        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setPassword(resultSet.getString("password")); //읽어온거 보여주기 위해 나열하는 거임

        resultSet.close();
        preparedStatement.close();
        connection.close();

        return user;
    }

}
