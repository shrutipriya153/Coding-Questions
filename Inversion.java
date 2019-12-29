package question;
import java.util.*;
public class Inversion {

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
		int count=0;
		int j;
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(arr[i]>arr[j] && i<j) {
					count++;
					System.out.println(arr[i]+" "+arr[j]+" "+count);
				}
					
			}
		}
		System.out.println(count);

	}

}
