package question;
import java.util.*;
public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m,n;
		System.out.println("Enter the size of both the array");
		m=sc.nextInt();
		n=sc.nextInt();
		int i,j,k=0;
		int a[]=new int[m];
		int b[]=new int[n];
		int c[]=new int[m+n];
		System.out.println("Enter the 1st the array");
		for(i=0;i<m;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the 2nd array");
		for(j=0;j<n;j++)
			b[j]=sc.nextInt();
		i=0;j=0;
		while(i<m && j<n) {
			if(a[i]>b[j]) {
				c[k]=b[j];
				k++;
				j++;
			}
			else if(a[i]<b[j]){
				c[k]=a[i];
				k++;
				i++;
			}
			else {
				c[k]=a[i];
				i++;
				j++;
				k++;
			}
		}
		while(i<m) {
			c[k++]=a[i];
			i++;
		}
		while(j<n) {
			c[k++]=b[j];
			j++;
		}
		System.out.println("The merged array is");
		for(i=0;i<m+n;i++)
			System.out.print(c[i]+" ");

	}

}
