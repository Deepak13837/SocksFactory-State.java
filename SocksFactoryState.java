package State;

public class SocksFactoryState {
	
	public static void main(String []args) {
		SocksFactory socks=new SocksFactory(100);
		System.out.println(socks);
		
		socks.machineOff();
		System.out.println(socks);
		
		socks.machineOn();
		System.out.println(socks);
		
		
		socks.knit();
		System.out.println(socks);
		
		socks.pack();
		System.out.println(socks);
		
		socks.machineOff();
		System.out.println(socks);
		
		socks.machineOn();
		System.out.println(socks);
		
		socks.machineOff();
		socks.machineOn();
		socks.usingWool();
		socks.machineOn();
		socks.loadWool(200);
		socks.machineOff();
		socks.knit();
		socks.pack();
		
		
		
		

		
		
	}

}
