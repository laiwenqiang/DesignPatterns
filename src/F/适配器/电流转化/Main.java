package F.������.����ת��;

public class Main {

	public static void main(String[] args) {
		new Computer(new PowerOldImpl()).start();
		
		new Computer(new PowerAdapter(new PowerNewImpl())).start();
	}

}
