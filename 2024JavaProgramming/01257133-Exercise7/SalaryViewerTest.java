import javax.swing.JFrame;

public class SalaryViewerTest {
	// Driver method
	public static void main(String[] args) {
		SalaryViewer viewer = new SalaryViewer();
		viewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewer.setSize(500, 250);
		viewer.setVisible(true);
	}
}
