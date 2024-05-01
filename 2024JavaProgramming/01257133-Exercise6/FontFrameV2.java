package ntou.cs.java2024;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FontFrameV2 extends JFrame {
	private JButton increaseButton; // button to increase font size
	private JButton decreaseButton; // button to decrease font size
	private JTextArea text; // displays example text
	private int fontSize = 20; // current font size

	public FontFrameV2() {
		super("Font Test");

		MyEventListner handler = new MyEventListner();
		// create buttons and add action listeners
		// TODO
		decreaseButton = setButton(-100, 0, handler, "Decrease font size");
		increaseButton = setButton(100, 0, handler, "Increase font size");

		// create text area and set initial font
		text = new JTextArea("Test");
		text.setFont(new Font("Consolos", Font.PLAIN, fontSize));

		// add GUI components to frame
		JPanel panel = new JPanel(); // used to get proper layout
		panel.add(decreaseButton);
		panel.add(increaseButton);

		add(panel, BorderLayout.NORTH); // add buttons at top
		add(new JScrollPane(text)); // allow scrolling
	}

	private JButton setButton(int x, int y, ActionListener listener, String font) {
		JButton button = new JButton();
		button.setBounds(x, y, 400, 200);
		button.addActionListener(listener);
		button.setFocusable(true);
		button.setVisible(true);
		button.setBackground(Color.WHITE);
		button.setText(font);

		return button;
	}

	private class MyEventListner implements ActionListener {
		// change font size when user clicks on a button
		// TODO
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == increaseButton) {
				fontSize += 2;
			} else {
				fontSize -= 2;
			}
			if (fontSize > 30 || fontSize < 8) {
				String tip;
				if (fontSize > 30) {
					fontSize = 30;
					tip = "No, it cannot be larger!";
				} else {
					fontSize = 8;
					tip = "No, it cannot be smaller!";
				}
				JOptionPane.showMessageDialog(null, tip, "WARNING!!!", JOptionPane.WARNING_MESSAGE);
			} else {
				text.setFont(new Font("Consolas", Font.PLAIN, fontSize));
			}
		}
	}

} 