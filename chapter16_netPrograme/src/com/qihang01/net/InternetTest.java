package com.qihang01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: InternetTest
 * Package: com.qihang01.net
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/24 22:36
 * @Version 1.0
 */
public class InternetTest {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("192.168.56.1");
            InetAddress inetAddress1 = InetAddress.getLocalHost();
            System.out.println(inetAddress);
            System.out.println(inetAddress1);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
