package forloops;
import java.util.Scanner;

public class PrintNnumbers {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many no to print: ");
		int n=sc.nextInt();
		
		
		
		for(int i=0;i<=n;i++) {
			System.out.println(i);
			
		}
		sc.close();
		
		
	}

}
