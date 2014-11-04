package F.适配器.电流转化;

/**
 * 
 * @author Administrator
 * 电脑类，只能接收PowerOld类型的电源。
 *
 */
public class Computer {
	private PowerOld powerOld;
	
	public Computer(PowerOld powerOld){
		this.powerOld = powerOld;
	}
	
	public void start(){
		double power = this.powerOld.insertPowerOld();
		System.out.println("输入" + power + "V电流");
		System.out.println("电脑启动。。。。");
	}
}
