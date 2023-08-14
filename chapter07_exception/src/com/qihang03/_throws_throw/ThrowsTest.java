package com.qihang03._throws_throw;

/**
 * ClassName: ThrowsTest
 * Package: com.qihang03._throws
 * Description:
 *3．是否真正处理了异常?
 *  >从编译是否能通过的角度看，看成是给出了异常万一要是出现时候的解决方案。此方案就是，继续向上抛出(throws)。
 *  但是，此throws的方式，仅是将可能出现的异常抛给了此方法的调用者。此调用者仍然需要考虑如何处理相关异常。
 *  从这个角度来看，throws的方式不算是真正意义上处理了异常。
 * 4．方法的重写的要求:
 *  子类重写的方法抛出的异常类型可以与父类被重写的方法抛出的异常类型相同，或是父类被重写的方法抛出的异常类型的子类。
 *  1．为什么需要手动抛出异常对象?
 *      在实际开发中，如果出现不满足具体场景的代码问题，我们就有必要手动抛出一个指定类型的异常对象。
 *  2.如何理解"自动vs手动"抛出导常对象?
 *    过程1:“抛"
 *      程序在执行的过程当中，一旦出现异常，就会在出现异常的代码处，生成对应异常类的对象，并将此对象抛出。一旦抛出,此程序就不执行其后的代码了。
 *    过程2:“抓”
 *      针对于过程1中抛出的异常对象，进行捕获处理。此捕获处理的过程，就称为抓。主动使用“throw” + 异常类的对象的方式抛出异常。
 *          一旦将异常进行了处理，代码就可以继续执行。  throw new RuntimeException("输入的类型不匹配")
 *  过程2:“抓”
 *      狭义上讲: try-catch的方式捕获异常，并处理。
 *      广义上讲:把"抓"理解为"处理”。则此时对应着异常处理的两种方式: try-catch-finally  throws
 *      在方法内部，满足指定条件的情况下，使用"throw异常类的对象"的方式抛出。
 *  4．注意点: throw后的代码不能被执行，编译不通过。
 *
 * @Author 刘起航
 * @Create 2023/7/25 22:20
 * @Version 1.0
 */
public class ThrowsTest {
    public static void main(String[] args) {
        Student s1  = new Student();
//        try{
//            s1.registe(10);
//            s1.registe(-10);
//            System.out.println(s1);
//
//        }catch (RuntimeException e){
////            e.printStackTrace();
//            e.getMessage();
//        }
        try{
            s1.registe(10);
            s1.registe(-10);
            System.out.println(s1);

        }catch (Exception e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
class Student{
    int id;

    public void registe(int id) throws Exception{
        if (id > 0){
            this.id = id;
        }else{
//            throw new Exception("输入的id非法");
            throw new BelowZeroException("输入的id非法");
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}

