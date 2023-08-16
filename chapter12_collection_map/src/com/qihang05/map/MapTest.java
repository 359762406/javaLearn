package com.qihang05.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * ClassName: MapTest
 * Package: com.qihang05.map
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/16 11:48
 * @Version 1.0
 */
public class MapTest {
    @Test
    public void test1(){
        Map map = new HashMap();
        map.put(null, null);
        System.out.println(map);
    }
    @Test
    public void test2(){
        Map map = new Hashtable();  //NullPointerException
//        map.put(null, null);
        map.put(123,"dda");
        System.out.println(map);
    }
}
