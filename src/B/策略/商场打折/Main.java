package B.����.�̳�����;

public class Main {

	public static void main(String[] args) {
		MemberStrategy memberStrategy;
		memberStrategy = new PrimaryMemberStrategy();
		Price price = new Price(memberStrategy);
		System.out.println(price.quote(10f));
		
		memberStrategy = new MiddleMemeberStrategy();
		price = new Price(memberStrategy);
		System.out.println(price.quote(10f));
		
		memberStrategy = new AdvancedMemberStrategy();
		price = new Price(memberStrategy);
		System.out.println(price.quote(10f));
		
	}

}
