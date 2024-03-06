import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	
	
	// Constructor
	public Paddle() {
		
		// Set width to Settings.PADDLE_WIDTH
		setWidth(Settings.PADDLE_WIDTH);
		
		// Set height to Settings.PADDLE_HEIGHT
		setHeight(Settings.PADDLE_HEIGHT);
		
		// Call resetPosition
		resetPosition();
		
	}
	
	/**
	 * Resets the paddle to the initial position
	 * Uses Settings.INITIAL_PADDLE_X/Y to set the position of the paddle
	 */
	public void resetPosition() {
		
		// Set the paddle's initial x position
		setX(Settings.INITIAL_PADDLE_X);
		
		// Set the paddle's initial y position
		setY(Settings.INITIAL_PADDLE_Y);
		
	}
	
	public void update() {
		
		x += xVelocity;
		
		
		// Prevent the paddle from moving outside of the left of the screen
		if (x <= 0) {			
			
			x = 0;	// Set x to 0 so it does not leave the screen
			
		}
		
		// Prevent the paddle from moving outside of the right of the screen
		/** The right screen margin is deducted from the window  and paddle width 
		 * to prevent the paddle from moving beyond the panel width to the window width */
		else if (x >= Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH - 15) {			
			
			x = Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH - 15;	// Set x to the right edge of the panel
			
		}

	}
	
	public void paint(Graphics g) {
		
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
		
	}
	
	/** Setter method for the xVelocity variable */
	public void setXVelocity(int vel) {		
		
		xVelocity = vel;	// Set x velocity variable to the parameter variable
		
	}
}
