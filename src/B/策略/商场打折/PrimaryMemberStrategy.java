package B.策略.商场打折;

public class PrimaryMemberStrategy implements MemberStrategy{

	@Override
	public double calcPrice(double price) {
		System.out.println("初级会员，没有优惠！");
		return price;
	}

}
