package State;

public class MachineOffState implements State{
	SocksFactory socks;
	public MachineOffState(SocksFactory socks) {
		// TODO Auto-generated constructor stub
		this.socks=socks;
	}

	@Override
	public void knit() {
		// TODO Auto-generated method stub
		if(socks.checkWool()) {
			System.out.println("Machine is turned on and Knitting is Started");
			socks.setState(socks.getMachineOn());
		}	else {
			System.out.println("Wool is out of Stock....");
			socks.setState(socks.getMachineOff());
		}
		
	}


	@Override
	public void Packing() {
		// TODO Auto-generated method stub
		System.out.println("Packing is completed");
		
	}


	@Override
	public void MachineOn() {
		// TODO Auto-generated method stub
		if(socks.checkWool()) {
			System.out.println("Machine is turned on and Knitting is Started");
			socks.setState(socks.getMachineOn());
		}	else {
			System.out.println("Wool is out of Stock....");
			socks.setState(socks.getMachineOff());
		}
	}


	@Override
	public void MachineOff() {
		// TODO Auto-generated method stub
		System.out.println("Machine is turned off..");
		
	}
	public String toString() {
		return "Machine is turned off";
		
	}

}
