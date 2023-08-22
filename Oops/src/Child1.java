
public class Child1 extends Parent {

	public Child1() {
		super();
		System.out.println("I'm a non parameterized constructor of Child1");
	}

	public Child1(int a) {
		super();
		System.out.println("I'm a parameterized constructor of Child1");
	}

	public static void m3() {

		System.out.println("Static method of Child");
	}

	public void m4() {

		System.out.println("Non static method of Child");
	}

	public static void main(String[] args) {

		m1();
		// way1 of calling non static method from parent
		Child1 obj = new Child1();
		obj.m2();
		// way2
		Parent obj1 = new Child1();
		obj1.m2();
		// way3
		Parent obj2 = new Parent();
		obj2.m2();

		// by composition
		Parent.m1();

		// calling constructors
		// constructors without arg - non parameterized
		new Child1();
		new Parent();
		System.out.println();
		// parameterized constructors
		new Parent(10); // parameterized constructor of parent
		System.out.println();
		new Child1(21);// parameterized of child and non parameterized of parent

	}

}
