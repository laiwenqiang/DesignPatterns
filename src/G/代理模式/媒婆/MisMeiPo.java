package G.代理模式.媒婆;

/**
 *
 * @author Administrator
 * 装饰着模式和代理模式很像！
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
