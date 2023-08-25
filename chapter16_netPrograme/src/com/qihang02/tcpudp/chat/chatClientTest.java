package com.qihang02.tcpudp.chat;

import javax.sound.midi.Receiver;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * ClassName: chatClientTest
 * Package: com.qihang02.tcpudp.chat
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/25 11:30
 * @Version 1.0
 */
public class chatClientTest {
    public static void main(String[] args) throws Exception{
        Socket socket = null;

            socket = new Socket("127.0.0.1", 9090);
            Receive receive = new Receive(socket);
            receive.start();
            Send send = new Send(socket);
            send.start();
            send.join();
            socket.close();
    }
}
class Send extends Thread{
    private Socket socket;
    public Send(Socket socket){
        super();
        this.socket = socket;
    }

    @Override
    public void run() {
        OutputStream outputStream = null;
        try {
            outputStream = socket.getOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            Scanner scanner = new Scanner(System.in);
            while(true){
                System.out.print("我：");
                String str = scanner.next();
                if("bye".equals(str)){
                    break;
                }
                printStream.println(str);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Receive extends Thread{
    private Socket socket;
    public Receive(Socket socket){
        super();
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();
            Scanner input = new Scanner(inputStream);
            while(input.hasNextLine()){
                String str = input.nextLine();
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}