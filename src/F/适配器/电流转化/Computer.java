package F.������.����ת��;

/**
 * 
 * @author Administrator
 * �����ֻ࣬�ܽ���PowerOld���͵ĵ�Դ��
 *
 */
public class Computer {
	private PowerOld powerOld;
	
	public Computer(PowerOld powerOld){
		this.powerOld = powerOld;
	}
	
	public void start(){
		double power = this.powerOld.insertPowerOld();
		System.out.println("����" + power + "V����");
		System.out.println("����������������");
	}
}
