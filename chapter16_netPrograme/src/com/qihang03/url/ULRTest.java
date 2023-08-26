package com.qihang03.url;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * ClassName: ULRTest
 * Package: com.qihang03.url
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/25 22:36
 * @Version 1.0
 */
public class ULRTest {
    /*
URL(Uniform Resource Locator)：统一资源定位符，它表示 Internet 上某一资源的地址。
通过 URL 我们可以访问 Internet 上的各种网络资源，比如最常见的 www，ftp 站点。
    浏览器通过解析给定的 URL 可以在网络上查找相应的文件或其他资源。
URL的基本结构由5部分组成：<传输协议>://<主机名>:<端口号>/<文件名>#片段名?参数列表
    * */
    public static void main(String[] args){
        /*
为了表示URL，java.net 中实现了类 URL。我们可以通过下面的构造器来初始化一个 URL 对象：

public URL (String spec)：通过一个表示URL地址的字符串可以构造一个URL对象。例如：

URL url = new URL("http://www. atguigu.com/");
public URL(URL context, String spec)：通过基 URL 和相对 URL 构造一个 URL 对象。例如：

URL downloadUrl = new URL(url, “download.html")
public URL(String protocol, String host, String file); 例如：

URL url = new URL("http", "www.atguigu.com", “download. html");
public URL(String protocol, String host, int port, String file); 例如:

URL gamelan = new URL("http", "www.atguigu.com", 80, “download.html");
        * */
        /*
public String getProtocol( ) 获取该URL的协议名

public String getHost( ) 获取该URL的主机名

public String getPort( ) 获取该URL的端口号

public String getPath( ) 获取该URL的文件路径

public String getFile( ) 获取该URL的文件名

public String getQuery( ) 获取该URL的查询名
        * */
        URL url = null;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        HttpURLConnection urlConnection = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            url = new URL(
                    "https://i2.hdslb.com/bfs/archive/880db51cd52532455c28ae8685f2cfe8a8fb4a82.jpg@672w_378h_1c_!web-home-common-cover.avif");
            //            url = new URL("https://pics7.baidu.com/feed/83025aafa40f4bfb61890e1700f7c8fcf6361858.jpeg@f_auto?token=0a41a47ef7e12b9d51aad00a5a390c31");
            urlConnection = (HttpURLConnection) url.openConnection();
            inputStream = urlConnection.getInputStream();
            fileOutputStream  = new FileOutputStream(new File("dest.jpg"));
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] bytes = new byte[1024];
            int len;
            while((len = inputStream.read(bytes)) != -1){
                bufferedOutputStream.write(bytes, 0,len);
            }
            bufferedOutputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if(bufferedOutputStream != null){
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            urlConnection.disconnect();
        }
    }
}
