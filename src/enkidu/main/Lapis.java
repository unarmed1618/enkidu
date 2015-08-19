package enkidu.main;

import java.io.Serializable;

public class Lapis implements Serializable{
private Lapis north;
private Lapis south;
private Lapis east;
private Lapis west;
public Character[][] map;
public Boolean[][] mask;
public Lapis(){
	map = new Character[32][32];
	mask = new Boolean[32][32];
	
}
public void populateMe(){
	for(int i = 0;i<32;i++){
		for(int j = 0; j<32;j++){
			map[i][j] = ' ';
			mask[i][j] = true;
		}
	}
}
public String drawEmpty(){
	StringBuilder result = new StringBuilder();
	for(int y= 0;y<32;y++){
		for(int x=0;x<32;x++)
		{
			result.append(map[x][y]);
		}
		result.append("/n");
	}
	return result.toString();
}
public String draw(Enki player){
	StringBuilder result = new StringBuilder();
	for(int y= 0;y<32;y++){
		for(int x=0;x<32;x++)
		{
			if(player.getX() ==x&&player.getY()==y)
				result.append(player.getAvatar());
			else
				result.append(map[x][y]);
			result.append(' ');
		}
		result.append('|');
		result.append("\n");
	}
	return result.toString();
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
