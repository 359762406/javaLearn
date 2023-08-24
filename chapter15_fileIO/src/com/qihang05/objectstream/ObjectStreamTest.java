package com.qihang05.objectstream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: ObjectStreamTest
 * Package: com.qihang05.objectstream
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/24 16:48
 * @Version 1.0
 */
public class ObjectStreamTest {
    /*
    * 数据流：DataOutputStream、DataInputStream
DataOutputStream：允许应用程序将基本数据类型、String类型的变量写入输出流中
DataInputStream：允许应用程序以与机器无关的方式从底层输入流中读取基本数据类型、String类型的变量。
    * */
    /*
    * 对象流DataOutputStream中的方法：将上述的方法的read改为相应的write即可。

数据流的弊端：只支持Java基本数据类型和字符串的读写，而不支持其它Java对象的类型。
而ObjectOutputStream和ObjectInputStream既支持Java基本数据类型的数据读写，又支持Java对象的读写，
*    所以重点介绍对象流ObjectOutputStream和ObjectInputStream。
对象流：ObjectOutputStream、ObjectInputStream
ObjectOutputStream：
* 将 Java 基本数据类型和对象写入字节输出流中。通过在流中使用文件可以实现Java各种基本数据类型的数据以及对象的持久存储。
ObjectInputStream：
* ObjectInputStream 对以前使用 ObjectOutputStream 写出的基本数据类型的数据和对象进行读入操作，保存在内存中。
    * */
    /*
序列化过程：用一个字节序列可以表示一个对象，该字节序列包含该对象的类型和对象中存储的属性等信息。
字节序列写出到文件之后，相当于文件中持久保存了一个对象的信息。

反序列化过程：该字节序列还可以从文件中读取回来，重构对象，对它进行反序列化。
对象的数据、对象的类型和对象中存储的数据信息，都可以用来在内存中创建对象。
    * */
    
    //序列化
    @Test
    public void test1() throws IOException {
        //1.
        File file = new File("Hello.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        //2.序列化过程
        oos.writeUTF("12121大东海哦对");
        oos.flush();
        oos.writeObject("3131awdawasda1发啊德瓦达");
        oos.flush();

    }
    //反序列化
    @Test
    public void test2() throws IOException, ClassNotFoundException {
        File file = new File("Hello.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        String readUTF = ois.readUTF();
        System.out.println(readUTF);
        String str2 = (String) ois.readObject();
        System.out.println(str2);
        ois.close();
    }
    //序列化
    @Test
    public void test3() throws IOException {
        //1.
        File file = new File("object1.dat");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        //2.序列化过程
        Person p1  = new Person(12,"john");
        oos.writeObject(p1);
        oos.flush();


        oos.close();
    }
    //反序列化
    @Test
    public void test4() throws IOException, ClassNotFoundException {
        File file = new File("object1.dat");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        String str2 =  ois.readObject().toString();
        System.out.println(str2);
        ois.close();
    }
    
}
