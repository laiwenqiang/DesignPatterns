package A.装饰者.儿子画画;

public class Mom implements Work {
	
	private Work work;
	
	public Mom(Work work){
		this.work = work;
	}

	@Override
	public void paint() {
		System.out.println("妈妈：儿子画画！");
		work.paint();
		System.out.println("妈妈：儿子画得好！");
	}

}
