package enkidu.main;

import java.io.Serializable;
import java.util.HashMap;

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
	public Entity[] entities;
	public String permissions;
	public Lapis(){
		permissions = "a";
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
	public String drawFull() {
		class Vector {
			int x;
			int y;
			public Vector(int x, int y){
				this.x= x;
				this.y = y;
			}
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + x;
				result = prime * result + y;
				return result;
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Vector other = (Vector) obj;
				if (x != other.x)
					return false;
				if (y != other.y)
					return false;
				return true;
			}
			
		}
		StringBuilder result = new StringBuilder();
		HashMap<Vector, Character> entityMap = new HashMap<Vector, Character>();
		for(Entity e:entities){
			if(e.isVisible()){
				entityMap.put(new Vector(e.getX(), e.getY()), e.getAvatar());
			}
		}
		for(int y= 0;y<LAPIS_HEIGHT;y++){
			for(int x=0;x<LAPIS_WIDTH;x++)
			{
				if(entityMap.containsKey(new Vector(x, y)))
					result.append(entityMap.get(new Vector(x, y)));
				else
					result.append(DRAW_TERRAIN_ONLY?terrain[x][y]:map[x][y]);
				result.append(' ');
			}
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
	public boolean permits(Character avatar) {
		return permissions.contains(avatar.toString());
		
	}
	public void sendWrite(char keyChar, int x, int y) {
		this.map[x][y] = keyChar;
		// TODO Auto-generated method stub
		
	}


	
}

