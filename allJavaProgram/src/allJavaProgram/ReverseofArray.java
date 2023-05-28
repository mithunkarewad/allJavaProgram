package allJavaProgram;

import java.util.Arrays;

public class ReverseofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,3,4,5,6};
		int i=0;int j=a.length-1;int temp;
		while(i<j)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}System.out.println(Arrays.toString(a));

	}

}
