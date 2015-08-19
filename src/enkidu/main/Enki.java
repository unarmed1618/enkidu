package enkidu.main;

import java.util.HashMap;




public class Enki {
HashMap<String, String> mapping;
	public Enki(){
		mapping = new HashMap<String, String>();
		mapping.put("a", "Left");
		mapping.put("s", "Down");
		mapping.put("d", "Right");
		mapping.put("w", "Up");
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
}
