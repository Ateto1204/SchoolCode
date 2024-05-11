package ntou.cs.java2024;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TemperatureConversion extends JFrame {
	private JLabel fromLabel;
	private JLabel toLabel;
	private JLabel sourceLabel;
	private JLabel targetLabel;
	private ButtonGroup fromOptions;
	private ButtonGroup toOptions;
	private JRadioButton fromFahrenheit;
	private JRadioButton fromCelsius;
	private JRadioButton fromKelvin;
	private JRadioButton toFahrenheit;
	private JRadioButton toCelsius;
	private JRadioButton toKelvin;
	private JPanel fromPanel;
	private JPanel toPanel;
	private JPanel inputPanel;
	private JTextField inputField;
	private JTextField outputField;
	private JButton conversionButton;

	private enum Option {
		FAHRENHEIT, 
		CELSIUS, 
		KELVIN, 
		DEFAULT
	}

	private Option fromOption = Option.DEFAULT;
	private Option toOption = Option.DEFAULT;

	public TemperatureConversion() {
		// TODO
		super("Temperature Conversion");
		MyEventListner listener = new MyEventListner();
		setLayout(new GridLayout(6, 1));

		fromLabel = new JLabel();
		fromLabel.setText("Convert from: ");
		fromLabel.setVisible(true);

		fromPanel = new JPanel();
		fromPanel.add(fromLabel);
		fromPanel.setLayout(new FlowLayout(3));
		fromPanel.setVisible(true);

		add(fromPanel, BorderLayout.NORTH);

		fromFahrenheit = new JRadioButton("Fahrenheit");
		fromFahrenheit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				fromOption = Option.FAHRENHEIT;
				UpdateOption();
			}
		});
		fromFahrenheit.setVisible(true);
		
		fromCelsius = new JRadioButton("Celsius");
		fromCelsius.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				fromOption = Option.CELSIUS;
				UpdateOption();
			}
		});
		fromCelsius.setVisible(true);

		fromKelvin = new JRadioButton("Kelvin");
		fromKelvin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				fromOption = Option.KELVIN;
				UpdateOption();
			}
		});
		fromKelvin.setVisible(true);

		JPanel fromOptionsPanel = new JPanel();
		fromOptionsPanel.setLayout(new FlowLayout(3));

		fromOptions = new ButtonGroup();
		fromOptions.add(fromFahrenheit);
		fromOptions.add(fromCelsius);
		fromOptions.add(fromKelvin);

		fromOptionsPanel.add(fromFahrenheit);
		fromOptionsPanel.add(fromCelsius);
		fromOptionsPanel.add(fromKelvin);
		fromOptionsPanel.setVisible(true);

		add(fromOptionsPanel);

		toLabel = new JLabel();
		toLabel.setText("Convert to: ");
		toLabel.setVisible(true);

		toPanel = new JPanel();
		toPanel.add(toLabel);
		toPanel.setLayout(new FlowLayout(3));
		toPanel.setVisible(true);

		add(toPanel);

		toFahrenheit = new JRadioButton("Fahrenheit");
		toFahrenheit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				toOption = Option.FAHRENHEIT;
				UpdateOption();
			}
		});
		toFahrenheit.setVisible(true);
		toCelsius = new JRadioButton("Celsius");
		toCelsius.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				toOption = Option.CELSIUS;
				UpdateOption();
			}
		});
		toCelsius.setVisible(true);
		toKelvin = new JRadioButton("Kelvin");
		toKelvin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				toOption = Option.KELVIN;
				UpdateOption();
			}
		});
		toKelvin.setVisible(true);
		
		JPanel toOptionsPanel = new JPanel();
		toOptionsPanel.setLayout(new FlowLayout(3));

		toOptions = new ButtonGroup();
		toOptions.add(toFahrenheit);
		toOptions.add(toCelsius);
		toOptions.add(toKelvin);

		toOptionsPanel.add(toFahrenheit);
		toOptionsPanel.add(toCelsius);
		toOptionsPanel.add(toKelvin);
		toOptionsPanel.setVisible(true);

		add(toOptionsPanel);

		JPanel sourcePanel = new JPanel();
		sourcePanel.setLayout(new GridLayout(2, 1));

		sourceLabel = new JLabel();
		sourceLabel.setText("Source Temperature: ");
		sourcePanel.add(sourceLabel);

		inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(1, 2));
		inputField = new JTextField();
		inputPanel.add(inputField);

		conversionButton = new JButton();
		conversionButton.setText("Convert");
		conversionButton.addActionListener(listener);
		inputPanel.add(conversionButton);
		sourcePanel.add(inputPanel);
		
		add(sourcePanel);

		JPanel targetPanel = new JPanel();
		targetPanel.setLayout(new GridLayout(2, 1));

		targetLabel = new JLabel();
		targetLabel.setText("Target Temperature: ");
		targetPanel.add(targetLabel);

		outputField = new JTextField();
		outputField.setEditable(false);
		targetPanel.add(outputField);

		add(targetPanel);
	}

	private void UpdateOption() {
		// try {
		// 	outputField.setText(fromOption.toString() + " " + toOption.toString());
		// } catch (NullPointerException e) {
		// 	outputField.setText("NULL");
		// }
	}

	private class MyEventListner implements ActionListener {
		// TODO	
		@Override
		public void actionPerformed(ActionEvent e) {
			if (fromOption == null || toOption == null) {
				String title = "NOTICE!!!";
				String message = "Occur unknown error!";
				JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
			} else if (fromOption == Option.DEFAULT || toOption == Option.DEFAULT) {
				String title = "NOTICE!!!";
				String message = "You must choose both options!";
				JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
			} else if (inputField.getText().isEmpty()) {
				String title = "NOTICE!!!";
				String message = "You must enter the number!";
				JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
			} else if (fromOption == toOption) {
				String title = "NOTICE!!!";
				String message = "You can't convert same unit!";
				JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
			} else {
				try {
					double degree = Double.parseDouble(inputField.getText());
					double result = convert(degree);
					outputField.setText(String.format("%.2f", result));
				} catch (NumberFormatException exception) {
					String title = "WARING!!!";
					String message = "Your input is invalid!";
					JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
					inputField.setText("");
				}
			}
		}
	}

	private double convert(double degree) {
		double result;
		if (fromOption == Option.FAHRENHEIT && toOption == Option.CELSIUS) {
			result = (degree-32) * 5/9;
		} else if (fromOption == Option.CELSIUS && toOption == Option.FAHRENHEIT) {
			result = degree * 9/5 + 32;
		} else if (fromOption == Option.CELSIUS && toOption == Option.KELVIN) {
			result = degree + 273.15;
		} else if (fromOption == Option.KELVIN && toOption == Option.CELSIUS) {
			result = degree - 273.15;
		} else if (fromOption == Option.FAHRENHEIT && toOption == Option.KELVIN) {
			result = (degree-32) * 5/9 + 273.15;
		} else if (fromOption == Option.KELVIN && toOption == Option.FAHRENHEIT) {
			result = (degree-273.15) * 9/5 + 32;
		} else {
			String title = "NOTICE!!!";
			String message = "Convert Failed!";
			JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
			result = -1;
		}
		return result;
	}
}