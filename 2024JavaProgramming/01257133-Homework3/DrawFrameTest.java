/*
 * javac -d . *.java
 * java ntou.cs.java2024.DrawFrameTest
 */

package ntou.cs.java2024;

import javax.swing.*;

public class DrawFrameTest {
    public static void main(String[] args) {
        DrawFrame application = new DrawFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(500, 400);
        application.setVisible(true);
    } // end main
} // end class TestDraw
