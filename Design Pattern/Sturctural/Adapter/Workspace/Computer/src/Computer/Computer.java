package Computer;

import USB.USB;

public class Computer {
	
	private USB usb;
	
	public Computer(USB usb) {
		this.usb = usb;
	}
	
	public void start() {
		usb.starting();
	}
	
}
