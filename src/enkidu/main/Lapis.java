package enkidu.main;

import java.io.Serializable;

public class Lapis implements Serializable{
	public static final int LAPIS_WIDTH = 32;
	public static final int LAPIS_HEIGHT = 32;
	public static final boolean DRAW_TERRAIN_ONLY = false;
	private Lapis north;
	private Lapis south;
	private Lapis east;
	private Lapis west;
	public Character[][] map;
	public Character[][] terrain;
	public Lapis(){
		map = new Character[LAPIS_WIDTH][LAPIS_HEIGHT];
		terrain = new Character[LAPIS_WIDTH][LAPIS_HEIGHT];

	}
	public void populateMe() {
		for(int y = 0;y<LAPIS_HEIGHT;y++){
			for(int x = 0; x<LAPIS_WIDTH;x++){
				map[x][y] = x==0||x==LAPIS_WIDTH-1||y==0||y==LAPIS_HEIGHT-1?'+':' ';
				terrain[x][y] = x==0||x==LAPIS_WIDTH-1||y==0||y==LAPIS_HEIGHT-1?'0':'1';
				//Make a box by default;
			}
		}
	}
	public String drawEmpty(){
		StringBuilder result = new StringBuilder();
		for(int y= 0;y<LAPIS_HEIGHT;y++){
			for(int x=0;x<LAPIS_WIDTH;x++)
			{
				result.append(map[x][y]);
			}
			result.append("\n");
		}
		return result.toString();
	}
	public String drawPlayerOnly(Enki player){
		StringBuilder result = new StringBuilder();
		for(int y= 0;y<LAPIS_HEIGHT;y++){
			for(int x=0;x<LAPIS_WIDTH;x++)
			{
				if(player.getX() ==x&&player.getY()==y)
					result.append(player.getAvatar());
				else
					result.append(DRAW_TERRAIN_ONLY?terrain[x][y]:map[x][y]);
				result.append(' ');
			}
			result.append("\n");
		}
		return result.toString();
	}
	public String drawFull(Enki[] entities) {
		return "";
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
