import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class SalaryViewer extends JFrame {
	private static final String[] COLUME_NAMES = { "Fisrt Name", "Last Name", "Salary" };

	private JTable playersTable;
	private JScrollPane tableWithScrollBar;

	private JPanel recordPanel;
	private JButton addButton;
	private JButton updateButton;

	private PlayerInfoReader reader;
	private PlayerInfoWriter writer;

	// Constructor
	public SalaryViewer() {
		super("Player Salary");

		// create reader and writer
		// TODO

		recordPanel = new JPanel();
		recordPanel.setLayout(new GridLayout(1, 2));
		addButton = new JButton("Add a Record");
		updateButton = new JButton("Update Table");

		MyEventHandler handler = new MyEventHandler();

		addButton.addActionListener(handler);
		updateButton.addActionListener(handler);

		recordPanel.add(addButton);
		recordPanel.add(updateButton);

		add(recordPanel, BorderLayout.SOUTH);

		fillData();
	}

	private void addPlayer() {
		String firstName;
		String lastName;
		long salary;

		String name = JOptionPane.showInputDialog(this, "Please input the player's name");

		int spaceIndex = name.indexOf(" ");
		if (spaceIndex != -1) {
			firstName = name.substring(0, spaceIndex);
			lastName = name.substring(spaceIndex + 1);
		} else {
			firstName = name;
			lastName = "";
		}

		String salaryString = JOptionPane.showInputDialog(SalaryViewer.this, "Please input the player's salary");

		try {
			salary = Long.valueOf(salaryString);
		} catch (java.lang.NumberFormatException ex) {
			salary = 0;
		}

		// write a record to the text file
		// TODO		

		updateTable();
	}

	private void updateTable() {
		remove(tableWithScrollBar);
		fillData();
		SwingUtilities.updateComponentTreeUI(this);
	}

	private void fillData() {
		
		// read all records from the text file
		// TODO
		
		playersTable = new JTable(data, COLUME_NAMES);
		tableWithScrollBar = new JScrollPane(playersTable);
		add(tableWithScrollBar, BorderLayout.CENTER);
	}

	private class MyEventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == addButton) {
				addPlayer();
			} else if (e.getSource() == updateButton) {
				updateTable();
			}
		}
	}
}
