package C.观察者.儿子起床;

public class Main {

	public static void main(String[] args) {
		Baby baby = new Baby();
		Dad dad = new Dad();
		Mom mom = new Mom();
		baby.addAction(dad);
		baby.addAction(mom);
		
		new Thread(baby).start();
		

	}

}
