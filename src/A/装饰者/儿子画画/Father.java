package A.װ����.���ӻ���;

public class Father implements Work {

	private Work work;
	
	public Father(Work work){
		this.work = work;
	}
	
	@Override
	public void paint() {
		System.out.println("�ְ֣����ӻ�����");
		work.paint();
		System.out.println("�ְ֣����ӻ���̫ˮ��");
	}

}
