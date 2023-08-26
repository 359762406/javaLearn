package com.qihang02.tcpudp;

import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.*;

/**
 * ClassName: UDPTest
 * Package: com.qihang02.tcpudp
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/25 22:17
 * @Version 1.0
 */
public class UDPTest {
    @Test
    public void send() throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 9090;
        byte[] bytes = "我是发送端".getBytes("UTF-8");
        DatagramPacket packet = new DatagramPacket(bytes,0, bytes.length,inetAddress, port);
        datagramSocket.send(packet);
        datagramSocket.close();

    }
    @Test
    public void receiver() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9090,InetAddress.getByName("127.0.0.1"));
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer,0, buffer.length);
        datagramSocket.receive(packet);
        System.out.println(new String(packet.getData(),0, packet.getLength()));
        datagramSocket.close();
    }


}
