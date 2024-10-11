import java.io.IOException;

public class Exception_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        try {
			m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("hi");
        
	}
	
	
	public static void m1() throws IOException {
		
		throw new IOException();
	}
	
	

}
