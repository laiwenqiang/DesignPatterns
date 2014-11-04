package B.策略.商场打折;

public class MiddleMemeberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double price) {
		System.out.println("中级会员，8折优惠！");
		return price * 0.8;
	}

}
