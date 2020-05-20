package Main;

import Computer.Computer;
import USB.USB;
import USB.USB3;
import USB.USB4;
import USB.USB4Adapter;

public class Main {

	public static void main(String[] args) {
		USB3 usb3 = new USB3();
		Computer computer1 = new Computer(usb3);
		computer1.start();
		
		USB4 usb4 = new USB4();
		USB usb4Adapter = new USB4Adapter(usb4);
		
		Computer computer2 = new Computer(usb4Adapter);
		computer2.start();
	}

}
