package ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crt {
	public static void main(String[] args) throws IOException {
		int i,t=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of bowlers ");
		int n=Integer.parseInt(br.readLine());
		int r[]=new int[n];
		int b[]=new int[n];
		Float e[]=new Float[n];
		Float o[]=new Float[n];
		System.out.println("Enter the runs conceded by the bowlers ");
		for(i=0;i<n;i++)
		{
			 r[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the number of balls for each bowler ");
		for(i=0;i<n;i++)
		{
			 b[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++)
		{
			 o[i]=(float)b[i]/6;
		}
		for(i=0;i<n;i++)
		{
			 e[i]=r[i]/o[i];
		}
		System.out.println("Economy of the bowlers is");
		for(i=0;i<n;i++)
		{
			 System.out.println(e[i]);
		}
		
	}
        
}
