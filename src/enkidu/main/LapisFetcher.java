package enkidu.main;

public class LapisFetcher {
final static boolean TESTING = true;
	public static Lapis getRootLapis() {
		// TODO Auto-generated method stub
		if(TESTING){
			Lapis l = new Lapis();
			l.populateMe();
			return l;
		}
		else return null;
			
	}

}
