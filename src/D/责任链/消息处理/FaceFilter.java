package D.������.��Ϣ����;

public class FaceFilter implements Filter{

	@Override
	public void doFileter(Request request, Response response, FilterChain chain) {
		request.requstStr = request.getRequstStr().replace(":)", "^v^-------------faceFilter");
		chain.doFileter(request, response, chain);
		response.responseStr = "-------------faceFilter";
	}

}
