package B.����.�̳�����;

public class MiddleMemeberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double price) {
		System.out.println("�м���Ա��8���Żݣ�");
		return price * 0.8;
	}

}
