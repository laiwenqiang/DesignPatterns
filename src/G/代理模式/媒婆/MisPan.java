package G.代理模式.媒婆;

public class MisPan implements Woman {

	@Override
	public void makeEyes() {
		System.out.println("潘金莲抛媚眼~");
	}

	@Override
	public void makeLove() {
		System.out.println("潘金莲makeLove！");
	}

}
