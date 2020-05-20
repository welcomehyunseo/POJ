package USB;

public class USB4Adapter implements USB{
	
	private USB4 usb4;
	
	public USB4Adapter(USB4 usb4) {
		this.usb4 = usb4;
	}
	
	@Override
	public void starting() {
		if(usb4 == null) return;
		
		usb4.another_starting();
	}
	
}
