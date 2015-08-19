package enkidu.main;

import java.util.HashMap;




public class Enki extends Entity{
private HashMap<String, String> mapping;

	public Enki(){
		super(Lapis.LAPIS_WIDTH/2,Lapis.LAPIS_HEIGHT/2,'a',LapisFetcher.getRootLapis());
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
		
		
	}
	public void play(){
	}
	public HashMap<String,String> getMapping() {
		return mapping;
	}
	
}
