import java.awt.Graphics;

public class Ball extends Sprite {
	
	private int xVelocity = 1, yVelocity = -1;
	
	
	// Constructor
	public Ball() {
		
		// Set width to Settings.BALL_WIDTH
		setWidth(Settings.BALL_WIDTH);
		
		// Set width to Settings.BALL_HEIGHT
		setHeight(Settings.BALL_HEIGHT);
		
		// Call resetPosition
		resetPosition();
		
	}
	
	
	/**
	 * Resets the ball to the initial position
	 * Uses Settings.INITIAL_BALL_X/Y to set the position of the ball
	 */
	public void resetPosition() {
		
		setX(Settings.INITIAL_BALL_X);	// Set the ball's x by using the INITIAL_BALL_X
		
		setY(Settings.INITIAL_BALL_Y);	// Set the ball's y by using the INITIAL_BALL_Y
		
	}
	
	
	public void update() {
		
		x += xVelocity;		// Increase the x variable by xVelocity	
		
		y += yVelocity;		// Increase the y variable by yVelocity
		
		
		// Bounce off left side of screen
		if (x <= 0) {
			
			x = 0;	// Set x to 0 so it does not leave the screen
			
			// Make the ball go right
			xVelocity =- getXVelocity();	// Change the x velocity
			
			setXVelocity(xVelocity);		// Set the new x Velocity
			
		}
		
		// Bounce off right side of screen
		/** The right screen margin is deducted from the window and ball width 
		 * to let the ball bounce off the panel instead of the window */
		if (x >= Settings.WINDOW_WIDTH - Settings.BALL_WIDTH - Settings.RIGHT_SCREEN_MARGIN) {			
			
			x = Settings.WINDOW_WIDTH - Settings.BALL_WIDTH - Settings.RIGHT_SCREEN_MARGIN;	// Set x to the right edge of the panel
			
			// Make the ball go left
			xVelocity =- getXVelocity();	// Change the x velocity
			
			setXVelocity(xVelocity);		// Set the new x Velocity
			
		}
		
		// Bounce off top of screen
		if (y <= 0) {
			
			y = 0;	// Set y to 0 so it does not leave the screen
			
			// Make the ball go downward
			yVelocity =- getYVelocity();	// Change the y velocity
			
			setYVelocity(yVelocity);		// Set the new y velocity
			
		}
		
	}
	
	/** Setter methods for x and y velocity */
	public void setXVelocity(int x) {		
		
		xVelocity = x;	// Set the x velocity of this object to the parameter variable
		
	}
	
	
	public void setYVelocity(int y) {		
		
		yVelocity = y;	// Set the y velocity of this object to the parameter variable
		
	}
	
	
	/** Getter methods for x and y velocity */
	public int getXVelocity() {
		
		return this.xVelocity;	// Return the x velocity value
		
	}
	
	
	public int getYVelocity() {
		
		return this.yVelocity;	// Return the y velocity value
		
	}
	
	
	public void paint(Graphics g) {
		
		g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
		
	}

}
