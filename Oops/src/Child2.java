
public class Child2 extends Parent {
	
	public Child2() {
		super();
		System.out.println("I'm a non parameterized constructor of Child2");
	}
	
	public Child2(int a) {
		super(2,3);
		System.out.println("I'm a parameterized constructor of Child2");
	}
	
	
	
	public static void main(String[]arg) {
		
//		new Parent();// calls parent C
//		new Child2();// can call parent C and child2 C (chaining) - but always calls Parent C first and then Child2 C
//		
		System.out.println();
//		
//		new Parent(2);// calls Parent C - with parameters
		//new Parent(3,2);// calls Parent C - with 2 args
		
		//new Child2();
		
		new Child2(2);
		
	}
	

}
