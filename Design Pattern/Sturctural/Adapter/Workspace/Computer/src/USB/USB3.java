package USB;

public class USB3 implements USB {

	@Override
	public void starting() {
		System.err.println("USB3 포트 성공적으로 연결되었습니다.");
	}
	
}
