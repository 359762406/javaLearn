package com.qihang02.selfDefine.exer2;

import java.util.List;

/**
 * ClassName: DAOTest
 * Package: com.qihang02.selfDefine.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/18 15:56
 * @Version 1.0
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1001", new User(1,23,"dad"));
        userDAO.save("1002", new User(2,21,"dadad"));

        userDAO.update("1002",new User(3,43,"eqeq"));
        List<User> list = userDAO.list();
        userDAO.delete("1003");
        for (User user : list){
            System.out.println(user);
        }
//        System.out.println(list);
    }
}
