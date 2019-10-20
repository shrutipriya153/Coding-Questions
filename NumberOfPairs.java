package question;
import java.util.*;
import java.lang.*;
public class NumberOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m,n,x,y,count=0;
		System.out.println("Enter the size of both the array");
		m=sc.nextInt();
		n=sc.nextInt();
		int i,j,k=0;
		int a[]=new int[m];
		int b[]=new int[n];
		System.out.println("Enter the 1st the array");
		for(i=0;i<m;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the 2nd array");
		for(j=0;j<n;j++)
			b[j]=sc.nextInt();
		for(i=0;i<m;i++) {
			x=a[i];
			for(j=0;j<n;j++) {
				y=b[j];
				if(Math.pow(x, y)>Math.pow(y, x))
					count++;
			}
		}
		System.out.println("Total num of pairs are "+count);

	}

}
