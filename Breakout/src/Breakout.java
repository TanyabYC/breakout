import java.awt.Color;

import javax.swing.JFrame;

public class Breakout extends JFrame {
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	// Constructor
	public Breakout() {
		
		// Set the size of the screen with Settings.WINDOW_WIDTH/HEIGHT
		setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
		
		// Set the title
		setTitle(Settings.WINDOW_NAME);
		
		// Set the background colour to white
		/** This method has no affect 
		 * unless it appears in the constructor of the BreakoutPanel class
		 * Further clarity is needed on design requirements for the game's background */
		setBackground(Settings.BACKGROUND_COLOUR);
		
		// Set resizable to false
		setResizable(false);
		
		// Set the default close operation of the frame to exit_on_close
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Create a new game panel object
        panel = new BreakoutPanel(this);
        
        // Add the panel object to the window frame
        add(panel);
        
        // Set visible to true
        setVisible(true);
        
	}


	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
	         public void run() {
	        	 
	        	 new Breakout();
	        	 
	         }
	         
		});

	}

}
