package C.观察者.儿子起床;

public class Mom implements ActionInterface {

	@Override
	public void doAction() {
		System.out.println("Mom! Come on!");
	}

}
