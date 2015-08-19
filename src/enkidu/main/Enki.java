package enkidu.main;

import java.util.HashMap;




public class Enki {
private HashMap<String, String> mapping;
private Lapis locale;
private Integer xpos;
private Integer ypos;
	public Enki(){
		mapping = new HashMap<String, String>();
		mapping.put("a", "Left");
		mapping.put("s", "Down");
		mapping.put("d", "Right");
		mapping.put("w", "Up");
		xpos = 16;
		ypos = 16;
		locale = LapisFetcher.getRootLapis();
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
		if(input.equals("Left"))
			xpos--;
		else if(input.equals("Right"))
			xpos++;
		else if(input.equals("Up"))
			ypos--;
		else if(input.equals("Down"))
			ypos++;
	}
	public Character getAvatar() {
		return 'a';
	}
	public int getX(){
		return xpos;
	}
	public int getY(){
		return ypos;
	}
}
