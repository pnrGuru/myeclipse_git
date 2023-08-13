package forloops;

public class PrintSumofnum {

	public static void main(String[] args) {
	/*Print sum of 1st 5 numbers
	i=	1,2,3,4,5{sum=0,sum+=i}*/
		int sum=0;
		for (int i=0;i<=5;i++) {
			sum+=i;
			System.out.println(sum);
		}
	}

}
