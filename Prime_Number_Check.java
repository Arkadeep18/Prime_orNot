import java.util.Scanner;

public class Prime_Number_Check {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
	
			//Prime number or not
				
			System.out.println("Enter the number");
			int n = sc.nextInt();
			int count=0;
				
			for(int a=1;a<=n;a++) {
				if(n%a==0) {
				 count++;
				}
			}
			if(count==2) {
				System.out.println("Prime number");
			}else {
				System.out.println("Not a prime number");
		}
				
	}

}


	