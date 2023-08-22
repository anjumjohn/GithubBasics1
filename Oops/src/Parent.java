
public class Parent {

	public Parent() {
		System.out.println("I'm a non parameterized constructor of Parent");
	}

	public Parent(int a) {
		this();
		System.out.println("Im a parameterized constructor of Parent");
	}

	public Parent(int a, int b) {
		this(a);
		System.out.println("I'm P C with two int variables of Parent");
	}

	public static void m1() {

		System.out.println("Static method of parent");
	}

	public void m2() {
		System.out.println("Non static method of parent");
	}

	public static void main(String[] args) {

		// by composition
		Child1.m3();
		new Parent(2, 3);
	}

}
