package enkidu.main;

import java.util.HashMap;




public class Enki {
private HashMap<String, String> mapping;
private Lapis locale;
private Integer xpos;
private Integer ypos;
private char avatar;
	public Enki(){
		//These settings are all default. Load up player specific settings on login/etc
		mapping = new HashMap<String, String>();
		mapping.put("a", "mw"); //Move west
		mapping.put("s", "ms");
		mapping.put("d", "me");
		mapping.put("w", "mn");
		mapping.put("j", "aw"); //Act west
		mapping.put("k", "as");
		mapping.put("l", "ae");
		mapping.put("i", "an");
		xpos = 16;
		ypos = 16;
		locale = LapisFetcher.getRootLapis();
		avatar = 'a';
	}
	public void play(){
	}
	public void inputTestLoop(){
		while(true)
		{			//a = 97
					//s = 115
					//d = 100
					//w = 119
					//j = 106
					//i = 105
					//k = 107
					//l = 108
		}
	}
	public HashMap<String,String> getMapping() {
		return mapping;
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
	public Lapis getLocale() {
		return locale;
	}
	public boolean canAct(String key) {
		// TODO Auto-generated method stub
		String action = mapping.get(key);
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
			xmod = -1;
			break;
		case "w":
			xmod = +1;
			break;
		}
		if(action.contains("a"))
		{
			//Acting -- Logic not yet managed.
			return false;
		} 
		else if(action.contains("m"))
		{				
			return locale.mask[xpos+xmod][ypos +ymod];
		}
		return false;
	}
	public boolean act(String key) {
		String action = mapping.get(key);
		if(action.contains("a"))
		{
			//Acting
			return false;
		} 
		else if(action.contains("m"))
		{
			//Moving
			if(canAct(key))
			{	
				move(action);
				return true;
			}
			else
				return false;
		}
		return false;
		// TODO Auto-generated method stub
		
	}
}
