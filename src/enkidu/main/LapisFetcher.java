package enkidu.main;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class LapisFetcher {
	final static boolean TESTING = true;
	final static String url = "http://enkidu-ejd.herokuapp.com/";
	public static Lapis getRootLapis() {
		// TODO Auto-generated method stub
		if(TESTING){
			Lapis l = new Lapis();
			l.populateMe();
			return l;
		}
		else return null;

	}
	/**
	 * Net-based deserializer
	 * @param x
	 * @param y
	 * @return
	 */
	public Lapis getLapis(Integer x, Integer y,Character avatar) {
/*
 * 2 bytes = character
 * A lapis is 32x32 (mapsize)
 * x2 (terrain)
 * +n (meta)
 */
		try {

			String charset = "UTF-8";  // Or in Java 7 and later, use the constant: java.nio.charset.StandardCharsets.UTF_8.name()
			String param1 = x.toString();
			String param2 = y.toString();
			String param3 = avatar.toString();
			String query = String.format("xval=%s&yval=%s&avatar=%s", 
					URLEncoder.encode(param1, charset), 
					URLEncoder.encode(param2, charset),
					URLEncoder.encode(param3, charset));
			URLConnection conn = new URL(url+"?"+query).openConnection();
			conn.setRequestProperty("Accept-Charset", charset);
			InputStream response = conn.getInputStream();
			byte[] data = new byte[8192];
			response.read(data);
			return new Lapis(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}



		return null;

	}

}
