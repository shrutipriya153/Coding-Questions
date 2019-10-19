package question;
import java.util.*;
public class Triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,count=0;
		System.out.println("Enter the size of the array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int i,j;
		int arr[]=new int[n];
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				sum=arr[i]+arr[j];
				for(int k=0;k<arr.length;k++) {
					if(sum==arr[k]) {
						count++;
					}
				}
			}
		}
		if(count==0) {
			System.out.println("-1");
		}
		else {
		System.out.println(count);
		}

	}

}
