package B.����.�̳�����;

public class AdvancedMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double price) {
		System.out.println("�߼���Ա��7.5���Żݣ�");
		return price * 0.75;
	}

}
