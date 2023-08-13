package forloops;
import java.util.Scanner;
public class PrintSumOfNumbers {

	public static void main(String[] args) {
		// Sum of n numbers: 
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n numbers");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			sum+=i;
			System.out.println(sum);
		}
		sc.close();
		
		
		
		
		

	}

}
