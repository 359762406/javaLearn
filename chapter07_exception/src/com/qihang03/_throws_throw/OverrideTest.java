package com.qihang03._throws_throw;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: OverrideTest
 * Package: com.qihang03._throws
 * Description:
 * 方法的重写的要求:(针对于编译时异常来说的)
 *      子类重写的方法抛出的异常类型可以与父类被重写的方法抛出的异常类型相同，
 *      或是父类被重写的方法抛出的异常类型的子类。
 * 3．方法重写应遵循的规则
 *  [复习]方法声明的格式:
 *      权限修饰符 返回值类型 方法名(形参列表) [throws 异常类型] { //方法体 }
 * 具体规则:
 *  父类被重写的方法与子类重写的方法的方法名和形参列表必须相同。子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符
 *  >子类不能重写父类中声明为private权限修饰的方法。
 * 关于返回值类型:
 *  >父类被重写的方法的返回值类型是void，则子类重写的方法的返回值类型必须是void
 *  >父类被重写的方法的返回值类型是基本数据类型，则子类重写的方法的返回值类型必须与被重写的方法的返回值类型相同
 *  >父类被重写的方法的返回值类型是引用数据类型(比如类)，则子类重的方法的返回值类型可以与被重写的方法的返回值
 *      类型相同或是被重写的方法的返回值类型的子类
 *  5．开发中，如何选择异常处理的两种方式?(重要、经验之谈)
 *      如果程序代码中，涉及到资源的调用（流、数据库连接、网络连接等），则必须考虑使用try-catch-finally来处理，保证不出现内存泄漏。
 *      如果父类被重写的方法没有throws异常类型，则子类重写的方法中如果出现异常，只能考虑使用try-catch-finally进行处理，不能throws.
 *      开发中，方法a中依次调用了方法b, c , d等方法，方法b, c , d之间是递进关系。此时，如果方法b , c , d中有异常，
 *          我们通常选择使用throws，而方法a中通常选择使用try-catch-finally。
 * @Author 刘起航
 * @Create 2023/7/26 10:19
 * @Version 1.0
 */
public class OverrideTest {
    public static void main(String[] args) {
        Father f = new Son();
        try{
            f.method1();
        }catch (IOException e){
            e.printStackTrace();
        }

        Number n = f.method3();
    }
}
class Father{
    public void method1() throws IOException{

    }
    public void method2(){

    }
    public Number method3(){

        return null;
    }
}

class Son extends Father{
    public void method1() throws FileNotFoundException { // 只能抛出父类异常的子类或者其本身

    }
//    public void method2() throws FileNotFoundException{  父类方法没有抛出异常
//
//    }
    public void method2() throws RuntimeException{ //运行时异常可以抛出

    }
    public Integer method3(){
        return null;
    }

}
