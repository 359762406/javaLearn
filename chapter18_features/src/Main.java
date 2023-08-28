/**
 * ClassName: ${NAME}
 * Package:
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/28 17:10
 * @Version 1.0
 */// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        * 对于新特性，我们应该从哪几个角度学习新特性呢？

语法层面：
    比如JDK5中的自动拆箱、自动装箱、enum、泛型
    比如JDK8中的lambda表达式、接口中的默认方法、静态方法
    比如JDK10中局部变量的类型推断
    比如JDK12中的switch
    比如JDK13中的文本块
API层面：
    比如JDK8中的Stream、Optional、新的日期时间、HashMap的底层结构
    比如JDK9中String的底层结构
    新的 / 过时的 API
底层优化
    比如JDK8中永久代被元空间替代、新的JS执行引擎
    比如新的垃圾回收器、GC参数、JVM的优化
        * */
    }
    //JDK8
    /*
    Java 8 (又称为 JDK 8或JDK1.8) 是 Java 语言开发的一个主要版本。
    Java 8 是oracle公司于2014年3月发布，可以看成是自Java 5 以来最具革命性的版本。
    Java 8为Java语言、编译器、类库、开发工具与JVM带来了大量新特性。
    * */
    /*
速度更快
代码更少(增加了新的语法：Lambda 表达式)
强大的 Stream API
便于并行
    并行流就是把一个内容分成多个数据块，并用不同的线程分别处理每个数据块的流。相比较串行的流，并行的流可以很大程度上提高程序的执行效率。
    Java 8 中将并行进行了优化，我们可以很容易的对数据进行并行操作。Stream API 可以声明性地通过 parallel() 与 sequential() 在并行流与顺序流之间进行切换。
最大化减少空指针异常：Optional
Nashorn引擎，允许在JVM上运行JS应用
    发音“nass-horn”，是德国二战时一个坦克的命名
    javascript运行在jvm已经不是新鲜事了，Rhino早在jdk6的时候已经存在。现在替代Rhino，官方的解释是Rhino相比其他JavaScript引擎（比如google的V8）实在太慢了，改造Rhino还不如重写。所以Nashorn的性能也是其一个亮点。
    Nashorn 项目在 JDK 9 中得到改进；在JDK11 中Deprecated，后续JDK15版本中remove。在JDK11中取以代之的是GraalVM。（GraalVM是一个运行时平台，它支持Java和其他基于Java字节码的语言，但也支持其他语言，如JavaScript，Ruby，Python或LLVM。性能是Nashorn的2倍以上。）
    * */
}