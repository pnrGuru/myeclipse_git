package stringprograms;

public class ReverseString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="hello";//olleh
		String z="Anusha";
		//using String Builder
		StringBuilder reverseString=new StringBuilder(x);
		reverseString.reverse();//str.reverse()
		System.out.println(reverseString);
		// using String Buffer class:
		//StringBuffer revBuff=new StringBuffer(z);
		//revBuff.reverse();
		//System.out.println(z);

	}

}
