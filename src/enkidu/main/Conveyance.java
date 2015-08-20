package enkidu.main;

public class Conveyance {
	private String conveyanceMask = "1";
	public Conveyance(String mask){
		conveyanceMask = mask;
	}
	public Conveyance(){
		conveyanceMask = "1";
	}
	public boolean contains(Character terrain){
		return conveyanceMask.contains(terrain.toString());
	}

}
