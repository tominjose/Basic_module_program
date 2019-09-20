package twelve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Foul {
	public static void main(String[] args) throws IOException {
		int i,j,g = 0,k=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of players ");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of fouls made by each player ");
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			 a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++)
		{
		 for(j=i+1;j<n;j++)
		 {
			 if(a[i]<a[j])
			 {
				 g=a[i];
				 k=i+1;
			 }
		 }
		}
		System.out.println("The eligible player is player no:" +k+"("+g+"fouls)");
	}
}
