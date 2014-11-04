package B.策略.商场打折;

public class Price {
	
	private MemberStrategy memberStrategy;
	
	public Price(MemberStrategy memberStrategy){
		this.memberStrategy = memberStrategy;
	}
	
	public double quote(double price){
		return this.memberStrategy.calcPrice(price);
	}
}
