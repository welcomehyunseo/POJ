package M2AS.Movement;

import M2AS.AngleAdjustment;

public class ReverseRotation implements AngleAdjustment{

	@Override
	public void angle_action() {
		System.out.println("역 방향으로 회전.");
	}
	
}
