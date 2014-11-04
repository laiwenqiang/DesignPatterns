package D.������.��Ϣ����;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
	private List<Filter> filters = new ArrayList<Filter>();
	private int index = 0;
	
	public FilterChain addFilter(Filter filter){
		this.filters.add(filter);
		return this;
	}

	@Override
	public void doFileter(Request request, Response response, FilterChain chain) {
		if(index == filters.size()){
			return;
		}
		Filter f = filters.get(index);
		index++;
		f.doFileter(request, response, chain);
	}
	
	
}
