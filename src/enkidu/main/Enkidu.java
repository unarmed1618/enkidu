package enkidu.main;

import enkidu.ui.*;

public class Enkidu {
	public static void main(String[] args) {
		System.out.println("Attempting to start up Enkidu");
		Eridug world = new Eridug();
		final Enki player = new Enki();
		EnkiduView ev;
		//player.inputTestLoop();
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                EnkiduView.createAndShowGUI(player);
            }
        });
		
	}
}
