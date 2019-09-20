package six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

		public static void main(String[] args) throws IOException {
			int i,c=0;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number of students \n");
			int n=Integer.parseInt(br.readLine());
			int a[]=new int[n];
			for(i=0;i<n;i++)
			{
			  a[i]=Integer.parseInt(br.readLine());
			  if(a[i]<50) {
				  c++;
			  }
			}
			System.out.println("Number of students appearing for retest is "+c);

	}

}
