package A.װ����.���ϴ���;

public class Main {

	public static void main(String[] args) {
		Beverage beverage = new Milk(new Coffee());
		System.out.println(beverage.getDes());
		System.out.println(beverage.getCost());
	}

}
