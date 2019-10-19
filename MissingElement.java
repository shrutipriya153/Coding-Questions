package question;
import java.util.*;
public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size");
		n=sc.nextInt();
		System.out.println("Enter the array elements");
		int i;
		int arr[]=new int[n];
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=((n+1)*(n+2))/2;
		for(i=0;i<n;i++) {
			sum-=arr[i];
		}
		System.out.println(sum);
	}

}
