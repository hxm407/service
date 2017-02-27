package gov.servyou.ws1;

public class HelloClient {
	public static void main(String[] args) {
		HelloServiceService hs = new HelloServiceService();
		HelloService ser = hs.getHelloServicePort();
		String str = ser.sayHello("xiao");
		System.out.println(str);
	}

}
