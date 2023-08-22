
public class Composition {

	public static void main(String[] arg) {

		Parent.m1();
		Child1.m3();
		// non static
		Parent obj = new Parent();
		obj.m2();
		Child1 obj1 = new Child1();
		obj1.m4();
	}
}
