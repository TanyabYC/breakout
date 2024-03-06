import java.awt.Rectangle;

public class Sprite {

	protected int x, y, width, height;
	
	/** Setter method for each variable */
	public void setX(int x) {
				
		this.x = x;		// Set this object's x variable to the parameter variable
		
	}
	
	public void setY(int y) { 
				
		this.y = y;		// Set this object's y variable to the parameter variable
		
	}
	
	public void setWidth(int width) {
				
		this.width = width;		// Set this object's width variable to the parameter variable
		
	}
	
	public void setHeight(int height) {
				
		this.height = height;	// Set this object's height variable to the parameter variable
		
	}
	
	/** Getter method for each variable */
	public int getX() { 
		
		return this.x;	// Return this object's x value
		
	}
	
	public int getY() { 
		
		return this.y;	// Return this object's y value
		
	}
	
	public int getWidth() { 
		
		return this.width;	// Return this object's width value
		
	}
	
	public int getHeight() {
		
		return this.height;	// Return this object's height value
		
	}
	
	Rectangle getRectangle() {
		
		return new Rectangle(x, y, width, height);
		
	}
	
}
