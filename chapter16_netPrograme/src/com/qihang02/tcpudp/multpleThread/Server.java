package com.qihang02.tcpudp.multpleThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

/**
 * ClassName: Server
 * Package: com.qihang02.tcpudp.multpleThread
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/25 17:23
 * @Version 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException{
        int port = 9090;
        ServerSocket server = new ServerSocket(9090);
        System.out.println("wait connecting... ");
        int count = 0;
        while(true){
            Socket socket = server.accept();
            System.out.println("第" + ++count + "个客户端" + socket.getInetAddress().getHostAddress());
            ClientHandlerThread clientHandlerThread = new ClientHandlerThread(socket);
            clientHandlerThread.start();
        }


    }
    static class ClientHandlerThread extends Thread{
        private Socket socket;
        private String ip;

        public ClientHandlerThread(Socket socket) {
            super();
            this.socket = socket;
            this.ip = this.socket.getInetAddress().getHostAddress();
        }

        @Override
        public void run() {
            try{
                //（1）获取输入流，用来接收该客户端发送给服务器的数据
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //（2）获取输出流，用来发送数据给该客户端
                PrintStream ps = new PrintStream(socket.getOutputStream());
                String str;
                // （3）接收数据
                while ((str = br.readLine()) != null) {
                    //（4）反转
                    StringBuilder word = new StringBuilder(str);
                    word.reverse();

                    //（5）返回给客户端
                    ps.println(word);
                }
                System.out.println("客户端" + ip+"正常退出");
            }catch(Exception  e){
                System.out.println("客户端" + ip+"意外退出");
            }finally{
                try {
                    //（6）断开连接
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
