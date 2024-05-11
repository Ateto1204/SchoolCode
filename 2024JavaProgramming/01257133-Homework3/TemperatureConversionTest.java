/*
 * javac -d . *.java
 * java ntou.cs.java2024.TemperatureConversionTest
 */

package ntou.cs.java2024;

import javax.swing.JFrame;

public class TemperatureConversionTest {
	public static void main(String[] args) {
		TemperatureConversion temperatureconversion = new TemperatureConversion();
		temperatureconversion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		temperatureconversion.setSize(350, 300);
		temperatureconversion.setVisible(true);
	}
}
