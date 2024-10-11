
public class encapuslation_demo {

	public static void main(String[] args) {
		
       Account a=new Account();
       //a.setName("vaib");
       System.out.println(a.getName());
       
	}
	

}

class Account{
	
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
