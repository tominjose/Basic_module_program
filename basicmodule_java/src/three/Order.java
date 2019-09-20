package three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Order {

	public static void main(String[] args) throws IOException {
		int i=0,j=0;
		Float t;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of students \n");
		int n=Integer.parseInt(br.readLine());
		Float a[]=new Float[n];
		for(i=0;i<n;i++)
		{
		  a[i]=Float.parseFloat(br.readLine());
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}

}
