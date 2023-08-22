
public class GrandChild extends Child1 {

	public static void main(String[] args) {
		// from parent
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

		// from child1
		m3();
		// way1 of calling non static method from child1
		GrandChild obj3 = new GrandChild();
		obj3.m4();
		// way2
		Child1 obj4 = new GrandChild();
		obj4.m4();
		Child1 obj5 = new Child1();
		obj5.m4();

	}
}
