package M2AS;

import M2AS.Movement.ReverseRotation;
import M2AS.Movement.Rotation;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * ������ ���� ��
		 * �ڷ� ����
		 * 
		 */
		
		/*
		 * �������� ���� ����
		 */
		
		AngleAdjustment forward_rotation = new Rotation();
		AngleAdjustment reverse_rotation = new ReverseRotation();
		
		/*
		 * �������� class ���� �� ������ ���� ���� ����
		 */
		ServoMotor first_behavior = new ServoMotor(forward_rotation);
		first_behavior.action();
		
		/*
		 * �������� class ���� �� �ڷ� ���� ���� ����
		 */
		ServoMotor second_behavior = new ServoMotor(reverse_rotation);
		second_behavior.action();
		
		/*
		 * console
		 * �� �������� ȸ��.
		 * �� �������� ȸ��.
		 */
	}

}
