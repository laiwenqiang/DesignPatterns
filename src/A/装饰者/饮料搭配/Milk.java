package A.×°ÊÎÕß.ÒûÁÏ´îÅä;

public class Milk implements Beverage{
	
	String des = "Milk!";
	private Beverage beverage;
	
	public Milk(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDes() {
		return this.beverage.getDes() + " " + des;
	}

	@Override
	public Double getCost() {
		return this.beverage.getCost() + 0.98;
	}

}
