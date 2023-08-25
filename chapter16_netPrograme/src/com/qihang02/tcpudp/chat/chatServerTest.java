package com.qihang02.tcpudp.chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * ClassName: chatServerTest
 * Package: com.qihang02.tcpudp.chat
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/25 11:29
 * @Version 1.0
 */
public class chatServerTest {
    static ArrayList<Socket> online = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9090);
        while(true){
            Socket accept = serverSocket.accept();
            online.add(accept);
            MessageHandler messageHandler = new MessageHandler(accept);
            messageHandler.start();
        }

    }
    static class MessageHandler extends Thread{
        private Socket socket;
        private String ip;
        public MessageHandler(Socket socket){
            super();
            this.socket = socket;
            this.ip = this.socket.getInetAddress().getHostAddress();
        }

        @Override
        public void run() {
            sendToOther(ip + "上线了");
            InputStream inputStream = null;
            try {
                inputStream = this.socket.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String str;
                while((str = bufferedReader.readLine()) != null){
                    sendToOther(ip + ":" + str);
                    System.out.println(ip + ":" + str);
                }
                sendToOther(ip + "下线了");
            } catch (IOException e) {
                sendToOther(ip + "掉线了");
                throw new RuntimeException(e);
            }finally {
                online.remove(socket);
            }
        }
        public void sendToOther(String message){
            for(Socket socket1 : online){
                OutputStream outputStream = null;
                try {
                    outputStream = socket1.getOutputStream();
                    PrintStream ps = new PrintStream(outputStream);
                    ps.println(message);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
