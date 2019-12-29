package question;

import java.util.Scanner;

public class SortInGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		int i;
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k;
		k=sc.nextInt();
		int left,right;
		for(i=0;i<n;i+=k) {
			left=i;
			right=Math.min(i+k-1, n-1);
			while(left<right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left+=1;
				right-=1;
			}
		}
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
