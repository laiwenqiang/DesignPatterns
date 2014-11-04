package F.适配器.电流转化;

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
