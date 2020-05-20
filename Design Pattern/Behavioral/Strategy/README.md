# M2AS
## Motor 

## angle adjustment 

## system 

### using strategy pattern



<img src="https://www.researchgate.net/profile/Abbas_Rasoolzadegan/publication/257482232/figure/fig3/AS:614100669304854@1523424417759/The-structure-of-the-Strategy-pattern-It-provides-broadcast-communication-A-subject.png">
출처: [www.researchgate.net]



* Context: 동작 실행 class

* Strategy: interface

* ConcreteStrategyA ~ C: 동작을 구현할 class, Implement of Strategy interface



## Explorer

* M2AS

   ㄴ AngleAdjestment.java //Strategy interface

   ㄴ Main.java  //실행 예제 class

   ㄴ ServoMotor.java  //Context 역할

   ㄴ Movement  //동작들

​	   ㄴ ReverseRotation.java  //ConcreteStrategy로써 모터의 동작

​	   ㄴ Rotation.java  //위와 같음



## Description

* Context >>> ServoMotor.java

* Strategy Interface >>> AngleAdjestment.java

* ConcreteStrategyA ~ C >>> ReverseRotation.java, Rotation.java

## Main.class (Example)

```java
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
```



## AngleAdjestment.java (interface)

```java
public interface AngleAdjustment {
	public void angle_action();
}
```



## ServoMotor.java (Context)

```java
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
```



## Movement directory (서버모터 동작들)

### ReverseRotation.java (역방향 회전)

```java
public class ReverseRotation implements AngleAdjustment{
	@Override
	public void angle_action() {
		System.out.println("역 방향으로 회전.");
	}
}
```

### Rotation.java (정방향 회전)

```java
public class Rotation implements AngleAdjustment{
	@Override
	public void angle_action() {
		System.out.println("정 방향으로 회전.");
	}	
}
```