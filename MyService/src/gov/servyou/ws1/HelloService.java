package gov.servyou.ws1;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HelloService {
	public String sayHello(String name){
		System.out.println("调用sayHello方法...");
		return "hello "+name;
	}
	
	@WebMethod(exclude = true)
	public String sayHello2(String name){
		System.out.println("next hello "+name);
		return "hello "+name;
	}
	
	public static void main(String[] args) {
		/**
		 * 参数1：发布地址
		 * 参数2：服务的是实现者 实现类
		 */
		Endpoint.publish("http://10.19.128.144:9408/hello", new HelloService());
		System.out.println("Service ready...");
	}
}
