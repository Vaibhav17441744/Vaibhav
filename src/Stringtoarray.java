import java.util.Arrays;

public class Stringtoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="vaibhav";
        String s3="vaibhav";
        char[] c1=s.toCharArray();
        System.out.println(Arrays.toString(c1));
        String [] s1=s.split("b");
        System.out.println(s1[0]);
        System.out.println(s1[1]);
        System.out.println(s.compareTo(s3));
        System.out.println(s.equals(s3));
	}

}
