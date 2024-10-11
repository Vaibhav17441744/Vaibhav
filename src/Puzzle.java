
public class Puzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test t1=new Test1();
        t1.m1();
        final int a=10;
       int c=a+1;

}
 class Test{
	
	public void m1() {
		
		System.out.println("parent method");
	}
}
class Test1 extends Test{
	public void m1() {
		System.out.println("child method");
		
	}
	
}

