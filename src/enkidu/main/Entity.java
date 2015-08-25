package enkidu.main;

public class Entity{
	private char avatar;

	private Integer xpos;
	private Integer ypos;
	private Lapis locale;
	private Conveyance conveyance;
	public boolean isWriting;
	public int writeXmod;
	public int writeYmod;
	private String lastAction;

	private String lastLastAction;
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
			if(lastAction.contains("r"))
				return true;
			//Acting -- Logic not yet managed.
			return false;
		} 
		else if(action.contains("m"))
		{				
			//System.out.println(xpos + "," + ypos);
			return conveyance.contains(locale.terrain[xpos+xmod][ypos+ymod]);
		}
		else if(action.contains("r")) //Writing
		{
			if(locale.permits(this.getAvatar()))
				return true;
			else
				return false; //Writing
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
				this.lastLastAction = this.lastAction;
				this.lastAction=action;
				return true;
			}
			else
				return false;
		}
		else if(action.contains("r")) {
			//Edit powers
			return true;
			
		}
		return false;
		// TODO Auto-generated method stub
		
	}
	public Lapis getLocale() {
		return locale;
	}
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return true;
	}
}
