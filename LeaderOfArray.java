package question;

import java.util.Scanner;

public class LeaderOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		System.out.println("Enter the element");
		int arr[]=new int[n];
		//int sum1=0;
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			//sum1+=arr[i];
		}
		int max=0;
		for(i=n-1;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
				System.out.println(max);
			}
		}
		
	}

}
