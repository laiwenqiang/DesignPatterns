package A.×°ÊÎÕß.¶ù×Ó»­»­;

public class Father implements Work {

	private Work work;
	
	public Father(Work work){
		this.work = work;
	}
	
	@Override
	public void paint() {
		System.out.println("°Ö°Ö£º¶ù×Ó»­»­£¡");
		work.paint();
		System.out.println("°Ö°Ö£º¶ù×Ó»­µÃÌ«Ë®£¡");
	}

}
