package com.qihang02.selfDefine.apply;

import java.util.List;

/**
 * ClassName: DAO
 * Package: com.qihang02.selfdefine.apply
 * Description:
 * DAO： data access object
 *  内部封装了操作数据库相关表的增删改查操作。(CRUD)
 * @Author 刘起航
 * @Create 2023/8/18 14:49
 * @Version 1.0
 */
public class DAO<T> {
    //增
    public void insert(T bean){
        //通过相应的sql语句，将bean对象的属性值写入到数据表中。
    }
    //删
    public T deleteById(int id){
        //
        return null;
    }

    //改
    public void  deleteById(int id, T bean){
        //

    }
    //查
    public T queryInstance(int id){
        return null;
    }
    public List<T> queryForList(int begin, int end){
        return null;
    }

    //定义泛型方法

    //比如:查询表中的记录数。(E: Long类型)
    //比如:查询表中最大的生日。(E: Date类型>

    public <E> E getValue(String sql){
        return null;
    }


}
