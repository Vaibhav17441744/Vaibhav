import java.util.Arrays;
import java.util.Scanner;

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* int [] rollNo= {10,20,30,40};
        int [] rollNo1=new int[10];
        String [] arr1= {"pune","mumbai","nag"};
        for(String s1:arr1)	{
        	System.out.println(s1);*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int len=sc.nextInt();
		int [] a=new int[len];
		System.out.println("Enter "+len+" elements of an array");
		for(int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
        
	}

}
