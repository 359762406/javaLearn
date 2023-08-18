package com.qihang02.selfDefine.apply;

import org.junit.Test;

import java.util.List;

/**
 * ClassName: DAOTest
 * Package: com.qihang02.selfdefine.apply
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/18 15:03
 * @Version 1.0
 */
public class DAOTest {
    @Test
    public void test1(){
        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.insert(new Customer());
    }
    @Test
    public void test2(){
        OrderDAO orderDAO = new OrderDAO();
        orderDAO.insert(new Order());
        List<Order> orderList = orderDAO.queryForList(1, 2);
    }


}
