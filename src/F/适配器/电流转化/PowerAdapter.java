package F.������.����ת��;

public class PowerAdapter implements PowerOld{

	private PowerNew powerNew;
	
	public PowerAdapter(PowerNew powerNew) {
		this.powerNew = powerNew;
	}
	
	@Override
	public double insertPowerOld() {
		return this.powerNew.insertPowerNew();
	}
	
}
