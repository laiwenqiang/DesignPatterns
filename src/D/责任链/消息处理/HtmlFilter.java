package D.������.��Ϣ����;

public class HtmlFilter implements Filter {

	@Override
	public void doFileter(Request request, Response response, FilterChain chain) {
		request.requstStr = request.getRequstStr().replace("<", "[").replace(">", "]----------htmlFilter\n");
		chain.doFileter(request, response, chain);
		response.responseStr += "------------htmlFilter";
	}

}
