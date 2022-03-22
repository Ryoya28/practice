package plactice;

public class Main{
	public void test(Object[] array) {
		System.out.println("A");
	}
	public void test(String[] array) {
		System.out.println("B");
	}
	public void test(Object obj) {
		System.out.println("C");
	}
	public static void Main(String[] args) {
		new Main().test(args);
	}
}