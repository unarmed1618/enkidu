package enkidu.main;
public class Enkidu {
	public static void main(String[] args) {
		System.out.println("Attempting to start up Enkidu");
		Eridug world = new Eridug();
		Enki player = new Enki();
		player.inputTestLoop();
	}
}
