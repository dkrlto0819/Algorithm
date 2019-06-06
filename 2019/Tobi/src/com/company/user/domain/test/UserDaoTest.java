package com.company.user.domain.test;

import com.company.user.domain.main.UserDao;
import com.company.user.domain.main.User;

import java.sql.SQLException;

public class UserDaoTest {
   public static void main(String[] args) throws SQLException, ClassNotFoundException {
       UserDao userDao = new UserDao();
       User user = new User();

       user.setName("J");
       user.setPassword("1234");

       userDao.add(user);

       System.out.println(user.getId() + "등록성공");
   }
}
