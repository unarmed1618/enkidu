package enkidu.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import enkidu.main.Enki;

public class EnkiduView extends JFrame implements KeyListener, ActionListener{
	private Enki player;
	JTextArea displayArea;
    JTextField typingArea;
    static final String newline = System.getProperty("line.separator");
	/**
	 * 
	 */
	private static final long serialVersionUID = -4677132694506312021L;
	public EnkiduView(Enki player,String name){
		super(name);
		this.player = player;
	}
	private static void updateView(){
Lapis locale = player.getLocale();
// draw the locale, draw the player and entities on top of it, draw it all up
}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		        //Clear the text components.
		        displayArea.setText("");
		        typingArea.setText("");
		         
		        //Return the focus to the typing area.
		        typingArea.requestFocusInWindow();
		    
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		String key = String.valueOf(e.getKeyChar());
		// TODO Auto-generated method stub
		if(player.getMapping().containsKey(key)){
			displayArea.setText(player.getMapping().get(key));
		}
		typingArea.setText("");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	public static void createAndShowGUI(Enki player) {
		// TODO Auto-generated method stub
	        //Create and set up the window.
	        EnkiduView frame = new EnkiduView(player, "EnkiduView");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         
	        //Set up the content pane.
	        frame.addComponentsToPane();
	         
	         
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	}
	 private void addComponentsToPane() {
         
	        JButton button = new JButton("Clear");
	        button.addActionListener(this);
	         
	        typingArea = new JTextField(0);
	        typingArea.addKeyListener(this);
	         
	        //Uncomment this if you wish to turn off focus
	        //traversal.  The focus subsystem consumes
	        //focus traversal keys, such as Tab and Shift Tab.
	        //If you uncomment the following line of code, this
	        //disables focus traversal and the Tab events will
	        //become available to the key event listener.
	        //typingArea.setFocusTraversalKeysEnabled(false);
	         
	        displayArea = new JTextArea();
	        displayArea.setEditable(false);
	        displayArea.setPreferredSize(new Dimension(400,400));
	        typingArea.setPreferredSize(new Dimension(0,0));
	        getContentPane().add(typingArea, BorderLayout.BEFORE_FIRST_LINE);
	        
	
	        getContentPane().add(displayArea, BorderLayout.CENTER);
	    }

	
}
