package enkidu.main;

public class Entity {
	private char avatar;

	private Integer xpos;
	private Integer ypos;
	private Lapis locale;
	private Conveyance conveyance;
	public Entity(int x, int y, char c,Lapis locale) {
		avatar = c;
		xpos = x;
		ypos = y;
		this.locale = locale;
		conveyance = new Conveyance();
		// TODO Auto-generated constructor stub
	}
	public void move(String input){
		if(input.equals("mw"))
			xpos--;
		else if(input.equals("me"))
			xpos++;
		else if(input.equals("mn"))
			ypos--;
		else if(input.equals("ms"))
			ypos++;
	}
	public Character getAvatar() {
		return avatar;
	}
	public int getX(){
		return xpos;
	}
	public int getY(){
		return ypos;
	}
	public boolean canAct(String action) {
		// TODO Auto-generated method stub
		int xmod = 0;
		int ymod = 0;
		switch(action.substring(1)){
		case "n":
			ymod = -1;
			break;
		case "s":
			ymod = +1;
			break;
		case "e":
			xmod = +1;
			break;
		case "w":
			xmod = -1;
			break;
		}
		if(action.contains("a"))
		{
			//Acting -- Logic not yet managed.
			return false;
		} 
		else if(action.contains("m"))
		{				
			//System.out.println(xpos + "," + ypos);
			return conveyance.contains(locale.terrain[xpos+xmod][ypos+ymod]);
		}
		return false;
	}
	public boolean act(String action) {
	
		if(action.contains("a"))
		{
			//Acting
			return false;
		} 
		else if(action.contains("m"))
		{
			//Moving
			if(canAct(action))
			{	
				move(action);
				return true;
			}
			else
				return false;
		}
		else if(action.contains("r")) {
			//Edit powers
			
		}
		return false;
		// TODO Auto-generated method stub
		
	}
	public Lapis getLocale() {
		return locale;
	}
}
