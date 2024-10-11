
public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="Java";
         int [][]=new int[3][3];
         char [] c=s.toCharArray();
         
         for(int i=0,j=c.length-1;i<=j;i++,j--) {
        	 
        	 char t=c[i];
        	 c[i]=c[j];
        	 c[j]=t;
        	 
         }
         String s1=new String(c);
         System.out.println(s1);
	}

}
