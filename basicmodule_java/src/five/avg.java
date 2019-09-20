package five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class avg {

	public static void main(String[] args) throws IOException {
		int i,avg;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of students \n");
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		int s=0;
		for(i=0;i<n;i++)
		{
		  a[i]=Integer.parseInt(br.readLine());
		  s=s+a[i];
		}
		avg=s/n;
		System.out.println("The average is "+avg);
		
	}

}
