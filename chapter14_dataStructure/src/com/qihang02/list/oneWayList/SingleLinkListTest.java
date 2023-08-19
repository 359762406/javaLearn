package com.qihang02.list.oneWayList;

import org.junit.Test;

import java.util.Iterator;

/**
 * ClassName: SingleLinkListTest
 * Package: com.qihang02.list.oneWayList
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/19 10:57
 * @Version 1.0
 */
public class SingleLinkListTest {
    @Test
    public void test1(){
        SingleLinkList<String> stringSingleLinkList = new SingleLinkList<>();
        stringSingleLinkList.insert("AA");
        stringSingleLinkList.insert("BB");
        stringSingleLinkList.insertHead("CC");
        stringSingleLinkList.insert("DD",1);
        Iterator<String> iterator = stringSingleLinkList.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next()  +" ");
//        }
        stringSingleLinkList.show();
//        stringSingleLinkList.deleteHead();
//        stringSingleLinkList.show();
//        stringSingleLinkList.insert("EE");
//        stringSingleLinkList.show();
//        stringSingleLinkList.delete();
//        stringSingleLinkList.show();
////        stringSingleLinkList.deleteHead();
////        stringSingleLinkList.show();
//        stringSingleLinkList.change("FF", 2);
//        stringSingleLinkList.show();
//        System.out.println("位置" + 1 + "的数据为" + stringSingleLinkList.find(1).getData());
//        System.out.println("位置" + 0 + "的数据为" + stringSingleLinkList.find(0).getData());
//        System.out.println("位置" + 2 + "的数据为" + stringSingleLinkList.find(2).getData());
//
//        stringSingleLinkList.delete(1);
//        stringSingleLinkList.show();
    }

}
