package ntou.cs.java2024;

import javax.swing.JFrame;

public class FontV1Test {
	public static void main(String[] args) {
		FontFrameV1 myFontFrame = new FontFrameV1();
		myFontFrame.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFontFrame.getFrame().setSize(400, 200); // set frame size
		myFontFrame.getFrame().setVisible(true); // display frame
	}
}