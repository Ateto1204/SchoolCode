import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PlayerInfoReader {
	private Scanner input;
	private String fileName; // target file name

	public PlayerInfoReader(String fileName) {
		this.fileName = fileName;
	}

	public String[][] readAllPlayers() {
		openFile();
		ArrayList<Player> list = readRecords();
		String[][] listArray = convertArrayList2Array(list);
		closeFile();

		return listArray;
	}

	public void openFile() {
		try {
			input = new Scanner(Paths.get(fileName));
		} catch (IOException ioException) {
			System.err.println("Error opening file. Terminating.");
			System.exit(1);
		}
	}

	// Read all records and return an ArrayList of Player Objects
	public ArrayList<Player> readRecords() {
		ArrayList<Player> list = new ArrayList<Player>();

		//System.out.printf("%-12s%-12s%10s%n", "First Name", "Last Name", "Balance");

		try {
			while (input.hasNext()) // while there is more to read
			{
				//TODO
			}
		} catch (NoSuchElementException elementException) {
			System.err.println("File improperly formed. Terminating.");
		} catch (IllegalStateException stateException) {
			System.err.println("Error reading from file. Terminating.");
		}

		return list;
	} // end method readRecords

	public String[][] convertArrayList2Array(ArrayList<Player> list) {
		int size = list.size();
		String[][] listArray = new String[size][];

		for (int i = 0; i < size; i++) {
			String[] record = new String[3];
			Player account = list.get(i);

			record[0] = account.getFirstName();
			record[1] = account.getLastName();
			record[2] = String.format("%,d", account.getSalary());

			listArray[i] = record;
		}

		return listArray;
	}

	// close file and terminate application
	public void closeFile() {
		if (input != null)
			input.close();
	}

}
