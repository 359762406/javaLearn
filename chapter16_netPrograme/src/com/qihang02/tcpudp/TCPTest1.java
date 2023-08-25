package com.qihang02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ClassName: TCPTest1
 * Package: com.qihang02.tcpudp
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/25 9:41
 * @Version 1.0
 */
public class TCPTest1 {
    @Test
    public void client() {
        //创建Socket
        InetAddress inetAddress = null;
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            inetAddress = InetAddress.getByName("192.168.56.1");
            int port = 8989;
            socket = new Socket(inetAddress, port);
            outputStream = socket.getOutputStream();
            outputStream.write("我是客户端".getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            //关闭socket
            try {
                assert socket != null;
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                assert outputStream != null;
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }






    }
    @Test
    public void server() throws RuntimeException {
        Socket socket = null;
        InputStream inputStream = null;
        ServerSocket serverSocket = null;
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            //创建ServerSocket
            int port = 8989;
            serverSocket = new ServerSocket(port);
            //调用accept(), 接收客户端的Socket
            socket = serverSocket.accept();
            System.out.println("服务器端已经开启");
            System.out.println("收到了来自于" +socket.getInetAddress().getHostAddress() + "的连接");
            //接收数据
            inputStream = socket.getInputStream();
            fileOutputStream = new FileOutputStream(new File("ServerReceivedMessage.txt"));
            outputStreamWriter = new OutputStreamWriter(fileOutputStream,"UTF-8");
            byte[] buffer = new byte[5];
            int len;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); //内部维护了一个Byte数组
            while((len = inputStream.read(buffer)) != -1){
//                String str = new String(buffer, 0, len);
//                fileOutputStream.write(buffer,0,len);
//                System.out.println(str);
                byteArrayOutputStream.write(buffer,0,len);
                byteArrayOutputStream.flush();


            }
            outputStreamWriter.write(byteArrayOutputStream.toString());
            outputStreamWriter.flush();
            System.out.println(byteArrayOutputStream.toString());
            System.out.println("数据接收完毕");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭Socket,ServerSocket, inputStream
            try {
                assert socket != null;
                socket.close();
                outputStreamWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                assert inputStream != null;
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if(serverSocket != null){

                    serverSocket.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
