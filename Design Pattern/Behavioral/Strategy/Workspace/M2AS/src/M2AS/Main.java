package M2AS;

import M2AS.Movement.ReverseRotation;
import M2AS.Movement.Rotation;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * 앞으로 전진 후
		 * 뒤로 후진
		 * 
		 */
		
		/*
		 * 서보모터 동작 선언
		 */
		
		AngleAdjustment forward_rotation = new Rotation();
		AngleAdjustment reverse_rotation = new ReverseRotation();
		
		/*
		 * 서보모터 class 선언 후 앞으로 전진 동작 실행
		 */
		ServoMotor first_behavior = new ServoMotor(forward_rotation);
		first_behavior.action();
		
		/*
		 * 서보모터 class 선언 후 뒤로 후진 동작 실행
		 */
		ServoMotor second_behavior = new ServoMotor(reverse_rotation);
		second_behavior.action();
		
		/*
		 * console
		 * 정 방향으로 회전.
		 * 역 방향으로 회전.
		 */
	}

}
