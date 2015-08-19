package enkidu.main;

import java.io.Serializable;

public class Lapis implements Serializable{
private Lapis north;
private Lapis south;
private Lapis east;
private Lapis west;
private Character[][] map;
private Boolean[][] mask;
public Lapis(){
	map = new Character[32][32];
	mask = new Boolean[32][32];

}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7421625109580957141L;
	public Lapis getNorth() {
		return north;
	}
	public Lapis getSouth() {
		return south;
	}
	public Lapis getEast() {
		return east;
	}
	public Lapis getWest() {
		return west;
	}

	
	
}
