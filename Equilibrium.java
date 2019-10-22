package question;
import java.util.*;
public class Equilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		System.out.println("Enter the element");
		int arr[]=new int[n];
		int sum1=0;
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum1+=arr[i];
		}
		int sum2=0,f=0;
		i=0;
		while(i<n) {
			sum1-=arr[i];
			if(sum1==sum2) {
				f=1;
				break;
			}
			sum2+=arr[i];
			i++;
			
		}
		if(f==0)
			System.out.println("-1");
		else
			System.out.println(i+1);
	}

}
