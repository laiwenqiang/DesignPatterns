package G.����ģʽ.ý��;

/**
 *
 * @author Administrator
 * װ����ģʽ�ʹ���ģʽ����
 */
public class MisMeiPo implements Woman {

	private Woman woman;
	
	public MisMeiPo(Woman woman){
		this.woman = woman;
	}
	@Override
	public void makeEyes() {
		this.woman.makeEyes();
	}

	@Override
	public void makeLove() {
		this.woman.makeLove();
	}

}
