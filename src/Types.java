
public class Types {
	
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Two b1=new Two();
	}

}

class a{
	a(){
		super(10);
		System.out.println(0);
	 	
	}
	a(int a){
		System.out.println(20);
	}
	
	public void m1() {
		
		
	}
}

class Two extends a{
	Two(){
		System.out.println("child");
	}
	
	public void m2() {}
}

