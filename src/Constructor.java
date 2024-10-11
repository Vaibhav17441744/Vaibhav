
public class Constructor {
	
	static int roll_no;
	static String name;
	
	Constructor(int rollno,String name){
		
		this.roll_no=rollno;
		this.name=name;
	}
	

	public Constructor() {
		// TODO Auto-generated constructor stub
		this(1, "sam");
		 System.out.println("non parameterized constructor");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
       //  Constructor s2=new Constructor(2,"vaibhav");
         Constructor s1=new Constructor();
         System.out.println(roll_no);
         System.out.println(name);
	}

}
