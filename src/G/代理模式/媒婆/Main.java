package G.代理模式.媒婆;

public class Main {

	public static void main(String[] args) {
		Woman woman = new MisMeiPo(new MisPan());
		woman.makeEyes();
		woman.makeLove();
	}

}
