package com.qihang02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ShortBuffer;

/**
 * ClassName: TCPTest2
 * Package: com.qihang02.tcpudp
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/25 10:19
 * @Version 1.0
 */
public class TCPTest2 {
    @Test
    public void client(){
        BufferedInputStream bufferedInputStream = null;
        OutputStream outputStream = null;
        Socket socket = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        InputStream inputStream = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("192.168.56.1");
            int port = 9090;
            socket = new Socket(inetAddress, port);
            File file = new File("dogImage.jpg");
            FileInputStream fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            outputStream = socket.getOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while((len = bufferedInputStream.read(buffer)) != -1){
                outputStream.write(buffer, 0, len);
                outputStream.flush();
            }
            System.out.println("数据发送完毕");
            socket.shutdownOutput();
            inputStream = socket.getInputStream();
            byteArrayOutputStream= new ByteArrayOutputStream();
            int receivedLen;
            byte[] receivedBuffer = new byte[5];
            while((receivedLen = inputStream.read(receivedBuffer)) != -1){
                byteArrayOutputStream.write(receivedBuffer, 0, receivedLen);
                byteArrayOutputStream.flush();
            }
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(byteArrayOutputStream != null){
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(bufferedInputStream != null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    @Test
    public void server(){
        Socket socket = null;
        InputStream inputStream = null;
        OutputStream os =null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            int port = 9090;
            ServerSocket serverSocket = new ServerSocket(port);
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();

            File file = new File("digImageCopy.jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] buffer = new byte[1024];
            int len;
            while((len = inputStream.read(buffer)) != -1){
                bufferedOutputStream.write(buffer, 0, len);
                bufferedOutputStream.flush();
            }
            System.out.println("数据接收完毕");
             os = socket.getOutputStream();
            os.write("收到你的图片".getBytes());
            os.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(os!= null){
                try {
                    os.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                if(bufferedOutputStream != null){

                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if(inputStream != null){

                    inputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if(socket != null){

                    socket.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }


}
