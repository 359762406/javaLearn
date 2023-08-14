package com.qihang05.method_more._02args;

/**
 * ClassName: StringConnect
 * Package: com.qihang05.method_more._02args
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/15 16:31
 * @Version 1.0
 */
public class StringConnect {
    public static void main(String[] args) {
        StringConnect strCon = new StringConnect();
        String str = strCon.connect("-", "hello", "world", "world");
        System.out.println(str);
        str = strCon.connect("/", "hello", "world");
        System.out.println(str);
        str = strCon.connect("...", "hello", "world");
        System.out.println(str);
        str = strCon.connect("-");
        System.out.println(str);
    }
    public String connect(String operator,String ... str){
        String result = "";
        if(str.length == 0){
            System.out.println("str is null!!");
        }
        for (int i = 0; i < str.length; i ++ ){
            if (i == 0){
                result += str[0];
            }else{
                result += (operator + str[1]);
            }
        }
        return result;
    }
}
