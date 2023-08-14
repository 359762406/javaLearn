package com.qihang02.trycatchfinally;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ClassName: ExceptionHandle
 * Package: com.qihang02.trycatchfinally
 * Description:
 *3．使用细节:
 *      >将可能出现异常的代码声明在try语句中。一旦代码出现异常，就会自动生成一个对应异常类的对象。并将此对象抛出。
 *      >针对于try中抛出的异常类的对象，使用之后的catch语句进行匹配。一旦匹配上，就进入catch语句块进行处理。一旦处理接触，代码就可继续向下执行。
 *      >如果声明了多个catch结构，不同的异常类型在不存在子父类关系的情况下，谁声明在上面，谁声明在下面都可以。
*          如果多个异常类型满足子父类的关系，则必须将子类声明在父类结构的上面。否则，报错。
 * 处理方式：
 *  1.java.lang.Throwable 类是Java程序执行过程中发生的异常事件对应的类的根父类。
 *      Throwable中的常用方法：
 *      public void printStackTrace()：打印异常的详细信息。  （推荐）
 *      包含了异常的类型、异常的原因、异常出现的位置、在开发和调试阶段都得使用printStackTrace。
 *      public String getMessage()：获取发生异常的原因。
 *  2.自己编写输出语句
 *  > try中声明的变量，出了try结构之后，就不可以进行调用了。
 *
 *  FINALLY
 *  因为异常会引发程序跳转，从而会导致有些语句执行不到。而程序中有一些特定的代码无论异常是否发生，都需要执行。例如，数据库连接、输入流输出流、
 *      Socket连接、Lock锁的关闭等，这样的代码通常就会放到finally块中。所以，我们通常将一定要被执行的代码声明在finally中。
 *
 *  唯一的例外，使用 System.exit(0) 来终止当前正在运行的 Java 虚拟机。
 *  不论在try代码块中是否发生了异常事件，catch语句是否执行，catch语句是否有异常，catch语句中是否有return，finally块中的语句都会被执行。
 *
 * finally语句和catch语句是可选的，但finally不能单独使用。
 * @Author 刘起航
 * @Create 2023/7/25 17:55
 * @Version 1.0
 */
public class ExceptionHandle {
    @Test
    public void test1(){
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(num);

        }catch (InputMismatchException e){
            System.out.println("出现InputMismatchException异常");
        }catch (NullPointerException e){
            System.out.println("出现了NullPointerException异常");
        }catch(RuntimeException e){   //前两个类的父类
            System.out.println("出现了RuntimeException异常");

        }finally {
            System.out.println("异常处理结束");
        }
    }

    @Test
    public void test2(){
        try {
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);

        }catch (InputMismatchException e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }


}
