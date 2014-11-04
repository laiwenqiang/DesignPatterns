package D.责任链.消息处理;

public interface Filter {
	public void doFileter(Request request, Response response, FilterChain chain);
}
