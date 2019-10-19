package question;
import java.util.*;
public class SubarrayWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum,i,j,res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		System.out.println("Enter the required sum");
		sum=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array element");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int flag=1;
		for(i=0;i<arr.length;i++) {
			for(j=i;j<arr.length;j++) {
				res+=arr[j];
				if(res>sum) {
					res=0;
					break;
				}
				if(res==sum) {
					res=0;
					flag=0;
					int c=j+1;
					int b=i+1;
					System.out.println(b+" "+c);
				}
			}
		}
		if(flag==1) {
			System.out.println("-1");
		}
		

	}

}
