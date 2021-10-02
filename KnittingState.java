package State;

public class KnittingState implements State{
	SocksFactory socks;
	public KnittingState(SocksFactory socks ) {
		this.socks = socks;
	}

	@Override
	public void knit() {
		// TODO Auto-generated method stub
		if(socks.checkWool()) {
			socks.setState(socks.getMachineOn());
			socks.usingWool();
		}else {
			socks.setState(socks.getMachineOff());

		
	}
}
	@Override
	public void Packing() {
		// TODO Auto-generated method stub
		System.out.println("Packaging is done...");
		
	}

	@Override
	public void MachineOn() {
		// TODO Auto-generated method stub
			System.out.println("Machine is already turned on..");
			socks.usingWool();
		}
		

	@Override
	public void MachineOff() {
		// TODO Auto-generated method stub
		System.out.println("wool is out of stock");
		socks.setState(socks.getMachineOff());
		
	}
	
	public String toString() {
		return "Knitting is done.";
		
	}

}
