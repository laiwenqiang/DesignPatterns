package B.策略.商场打折;

public class AdvancedMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double price) {
		System.out.println("高级会员，7.5折优惠！");
		return price * 0.75;
	}

}
