package com.qihang02.selfDefine.exer2;

import java.util.*;

/**
 * ClassName: DAO
 * Package: com.qihang02.selfDefine.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/18 15:14
 * @Version 1.0
 */
public class DAO<T> {
    Map<String, T> map = new HashMap<>();
    //保存T类型的对象到Map成员变量中
    public void save(String id, T entry){
        map.put(id, entry);
    }
    //从map中获得id对应的对象
    public T get(String id){
        return map.get(id);
    }
    //替换 map 中key为id的内容,改为 entity 对象
    public void update(String id, T entity){
        if (!map.containsKey(id)){

            map.put(id,entity);
        }else{
            System.out.println("没有该id");
        }
    }
    //返回map中存放的所有T对象
    public List<T> list(){
        /*
        * map.values()返回的类型是collection不能转为list  多态转换异常
        * */
        //way1
//        Iterator<T> iterator = map.values().iterator();
//        List<T> list = new ArrayList<>();
//        while(iterator.hasNext()){
//            list.add(iterator.next());
//        }
//        return list;
        //way2
        Collection<T> values = map.values();
        ArrayList<T> list = new ArrayList<>(values);
        return list;
    }
    //删除指定id 对象
    public void delete(String id){
        if (!map.containsKey(id)){

            map.remove(id);
        }else{
            System.out.println("没有该id");
        }
    }


}
