package A.װ����.���ӻ���;

public class Mom implements Work {
	
	private Work work;
	
	public Mom(Work work){
		this.work = work;
	}

	@Override
	public void paint() {
		System.out.println("���裺���ӻ�����");
		work.paint();
		System.out.println("���裺���ӻ��úã�");
	}

}
