
public class Basic {

	
	public static void main(String args[]) {
		System.out.println("main method");
		f1();
		Basic b=new Basic();
		b.f2();
		
	}
	
	static void f1() {
		
		System.out.println("f1");
	}
	
	void f2() {
		f3();
		System.out.println("f2");
	}
	
	void f3() {
		f1();
		System.out.println("f3");
	}
}
class B{
	
	public static void main(String args[]) {
		
		Basic.f1();
		System.out.println("f3");

		System.out.println("f9");
		System.out.println("f7");


		
	}
}
