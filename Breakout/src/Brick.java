import java.awt.Graphics;

public class Brick extends Sprite {

	private boolean broken = false;
	
	// Constructor
	public Brick(int x, int y) {
		
		// Set x using the parameter
		this.x = x;	
		
		// Set y using the parameter
		this.y = y;		
		
		// Set the width of the brick using Settings.BRICK_WIDTH
		setWidth(Settings.BRICK_WIDTH);
		
		// Set the height of the brick using Settings.BRICK_HEIGHT
		setHeight(Settings.BRICK_HEIGHT);
		
	}

	public boolean isBroken() {
		
		return broken;	// Return the broken variable
		
	}
	
	/** Setter method for the variable, broken */
	public void setBroken(boolean b) {
		
		broken = b;		// Set the broken variable using the parameter given
		
	}
	
	public void paint(Graphics g) {
		
		if (!broken) {
			
			g.fillRect(x, y, Settings.BRICK_WIDTH, Settings.BRICK_HEIGHT);
			
		}
		
	}
	
}
