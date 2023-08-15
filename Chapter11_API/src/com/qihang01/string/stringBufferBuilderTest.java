package com.qihang01.string;

import org.junit.Test;

/**
 * ClassName: stringBufferBuilderTest
 * Package: com.qihang01.string
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/15 9:18
 * @Version 1.0
 */
public class stringBufferBuilderTest {
    public static void main(String[] args) {

    }
    @Test
    public void test1(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abe").append("313");
        stringBuilder.delete(1,2);
        stringBuilder.insert(2,121);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder);
    }
    @Test
    public void test2(){
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        System.out.println(stringBuffer); //"null"
        System.out.println(stringBuffer.length()); // 4
        StringBuffer stringBuffer1 = new StringBuffer(str); //NullPointerException
        System.out.println(stringBuffer1);
    }

}
