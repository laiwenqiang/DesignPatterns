package D.责任链.消息处理;

public class HtmlFilter implements Filter {

	@Override
	public void doFileter(Request request, Response response, FilterChain chain) {
		request.requstStr = request.getRequstStr().replace("<", "[").replace(">", "]----------htmlFilter\n");
		chain.doFileter(request, response, chain);
		response.responseStr += "------------htmlFilter";
	}

}
