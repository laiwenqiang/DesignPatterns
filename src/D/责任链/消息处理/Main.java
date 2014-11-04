package D.责任链.消息处理;

public class Main {
	
	public static void main(String[] args) {
		String message = "hello world! <hello, world!>:)";
		Request request = new Request();
		request.setRequstStr(message);
		
		Response response = new Response();
		response.setResponseStr("response");
		
		FilterChain chain = new FilterChain();
		chain.addFilter(new HtmlFilter()).addFilter(new FaceFilter());
		chain.doFileter(request, response, chain);
		
		System.out.println(request.getRequstStr());
		System.out.println(response.getResponseStr());
	}
	
	
	
}
