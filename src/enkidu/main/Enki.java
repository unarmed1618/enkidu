package enkidu.main;

import java.util.HashMap;



/**
 * This is basically the player class.
 * 
 * @author Emilydarrow
 *
 */
public class Enki extends Entity implements Interactable{
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
		mapping.put("r", "vr"); //Visual write
		mapping.put("t", "tr"); //Terrain write
		mapping.put("u", "ur"); //Unicode write
		mapping.put("e", "lr"); //Entity(living) Write
		
		
	}
	public void play(){
	}
	public HashMap<String,String> getMapping() {
		return mapping;
	}
	@Override
	public String interactWith() {
		// TODO Auto-generated method stub
		return "This is a player";
	}
	public void sendWrite(char keyChar, int x, int y) {
		// TODO Auto-generated method stub
		super.getLocale().sendWrite(keyChar, x,y);
	}
	
	
}
