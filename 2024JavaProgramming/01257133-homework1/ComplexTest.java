package ntou.cs.java2024;

// javac -d . ComplexTest.java
// java ntou.cs.java2024.ComplexTest

public class ComplexTest {	
	public static void main (String[] args) {
		Complex a = new Complex(1.11, 2.22);
		Complex b = new Complex(3.33, -4.44);

		System.out.println("a = " + a);
		System.out.println("Conjugates of a = " + a.conjugate());
		System.out.println("Absolute value of a = " + a.absolute());
		System.out.println();

		System.out.println("b = " + b);
		System.out.println("Conjugates of b = " + b.conjugate());
		System.out.println("Absolute value of b = " + b.absolute());
		System.out.println();

		System.out.println("a + b = " + a.add(b));
		System.out.println("a - b = " + a.subtract(b));
		System.out.println("a x b = " + a.multiply(b));
		System.out.println("a / b = " + a.divide(b));
		System.out.println();	
			
		Complex c = new Complex();
		Complex d = new Complex();

		System.out.println("c = " + c);
		System.out.println("Conjugates of c = " + c.conjugate());
		System.out.println("Absolute value of c = " + c.absolute());
		System.out.println();

		System.out.println("d = " + d);
		System.out.println("Conjugates of d = " + d.conjugate());
		System.out.println("Absolute value of d = " + d.absolute());
		System.out.println();

		System.out.println("a + b = " + c.add(d));
		System.out.println("a - b = " + c.subtract(d));
		System.out.println("a x b = " + c.multiply(d));
		System.out.println("a / b = " + c.divide(d));
		System.out.println();
	}	
}