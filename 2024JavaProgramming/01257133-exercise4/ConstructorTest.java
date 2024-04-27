package ntou.cs.java2024;

/*
 * javac -d . *.java
 * java ntou.cs.java2024.ConstructorTest
 */

public class ConstructorTest {
	public static void main(String args[]) {
		ThirdWriter writer = new ThirdWriter();
		writer.showLastLine();
	}
}

class BaseWriter {
	public BaseWriter() {
		System.out.println("1. 子類別不可縮小父類別方法的存取範圍");
	}

	public BaseWriter(String param) {
		this();
		System.out.println("2. 父子類別的constructor沒有繼承關係");
	}
}

class SecondWriter extends BaseWriter {
	public SecondWriter() {
		this("");
		System.out.println("4. 子類別的constructor會自動(或人為)呼叫父類別的constructor");
	}

	public SecondWriter(String param) {
		super("");
		System.out.println("3. 任何類別的constructor可透過this呼叫同類別其他constructor");
	}

	public SecondWriter(String param1, int param2) {
		this();
		System.out.println("5. 子類別的constructor第一行僅能super或this擇一");
	}

	public SecondWriter(String param1, int param2, boolean param3) {
		this("", 1);
		System.out.println("6. 子類別重複宣告定義父類別的static method，不是override");
	}

	public void showLastLine() {
		System.out.println("9. 父子的類別不在同一個package，而子類別再宣告定義了父類別內的package method，不是Override");
	}

}

class ThirdWriter extends SecondWriter {
	public ThirdWriter() {
		this("");
		System.out.println("8. 可以用@Override清楚標示這個是一個overridden method");
	}

	public ThirdWriter(String param) {
		super("", 1, false);
		System.out.println("7. 於子類別重新宣告定義父類別的private方法，不是Override");
	}

	public void showLastLine() {
		super.showLastLine();
		System.out.println("10. 父子的類別不在同一個package，而子類別再宣告定義了父類別內的public method，是Override");
	}
}
