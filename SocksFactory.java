package State;

public class SocksFactory {

	State machineOnState;
	State machineOffState;
	State knittingState;
	State packingState;
	
	State state= knittingState;
	double wool=0.0;
	
	public SocksFactory(double wool) {
		machineOnState =new MachineOnState(this);
		machineOffState =new MachineOffState(this);
		knittingState=new KnittingState(this);
		packingState =new PackingState(this);
		
		this.wool=wool;	
		if (wool>0) {
			state=knittingState;
		}
	}
	
		public void knit() {
			state.knit();
		}
		
		public void machineOff() {
			state.MachineOff();
		}
		public void machineOn() {
			state.MachineOn();
		}
		public void pack() {
			state.Packing();
		}
		
		public State getKnittingState() {
			return knittingState;
		}
		public State getMachineOn() {
			return machineOnState;
		}
		public State getMachineOff() {
			return machineOffState;
		}
		public State getPackingState() {
			return packingState;
		}

		public void setState(State state) {
			this.state = state;
		}
		
		public double getWool() {
			return wool;
		}
		public void loadWool(double wool) {
			this.wool += wool;
		}
		public boolean checkWool() {
				return wool > 25;
			}
		public void usingWool() {
			this.wool -= 25.0;
		}
		public String toString() {
			StringBuffer result = new StringBuffer();	
			
			if( wool != 1) {
				result.append("");
			}
			result.append(" " + state + "\n");
			return result.toString();
		}
}
