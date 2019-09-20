package fourteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ncr {
	public static void main(String[] args) throws IOException {
		int fn=1,fr=1,ft=1;
		long ncr;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of n \n");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the value of r \n");
		int r=Integer.parseInt(br.readLine());
		int t=n-r;
		for(int i=n;i>1;i--)
		{
			
			fn=fn*i;
		}
		for(int i=r;i>1;i--)
		{
			
			fr=fr*i;
		}
		for(int i=t;i>1;i--)
		{
			
			ft=ft*i;
		}
		ncr=fn/(fr*ft);
		System.out.println("The NCR factor for given value is "+ ncr);
	}
}
