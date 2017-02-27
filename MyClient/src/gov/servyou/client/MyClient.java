package gov.servyou.client;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MyClient {
	public static void main(String[] args) throws Exception {
		//获取客户端地址
		Socket s = new Socket("10.19.128.144",9407);
//		创建输出连接
		OutputStream os = s.getOutputStream();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		bw.write("你吃了吗？");
		
		bw.close();
		os.close();
		s.close();
	}
}
