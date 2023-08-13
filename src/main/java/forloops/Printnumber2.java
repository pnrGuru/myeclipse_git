package forloops;
import java.util.Scanner;
public class Printnumber2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			System.out.println(i*(i+1));
		}
		sc.close();

	}

}
