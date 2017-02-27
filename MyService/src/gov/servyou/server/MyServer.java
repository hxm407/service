package gov.servyou.server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) throws Exception {
		while(true){
			//创建客户端服务
			ServerSocket ss = new ServerSocket(9407);
			System.out.println("等待客户端请求。。。");
			//等待客户端请求
			Socket s = ss.accept();
			InputStream is = s.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			System.out.println("客户端说："+ br.readLine());
			
			br.close();
			is.close();
			s.close();
			ss.close();
		}
		
	}
}
