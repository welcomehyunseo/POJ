package M2AS;

public class ServoMotor {
	private AngleAdjustment adjustment;
	
	public ServoMotor(AngleAdjustment adjustment) {
		this.adjustment = adjustment;
	}
	
	public void action() {
		if(adjustment == null) return;
		
		adjustment.angle_action();
	}
}
