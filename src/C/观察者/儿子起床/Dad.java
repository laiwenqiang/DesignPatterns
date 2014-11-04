package C.观察者.儿子起床;

public class Dad implements ActionInterface {

	@Override
	public void doAction() {
		System.out.println("Dad! Come on!");
	}

}
