package ntou.cs.java2024;

import java.awt.Color;
import java.awt.Graphics;

public class MyRect extends MyBoundedShape {
	// call default superclass constructor
	public MyRect() {
		super();
	} // end MyRect no-argument constructor

	// call superclass constructor passing parameters
	public MyRect(int x1, int y1, int x2, int y2, Color color, boolean isFilled) {
		super(x1, y1, x2, y2, color, isFilled);
	} // end MyRect constructor

	// draw rectangle
	public void draw(Graphics g) {
		g.setColor(getColor());

		if (isFilled())
			g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		else
			g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
	} // end method draw
} // end class MyRect