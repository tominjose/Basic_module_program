package eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fib {
	public static void main(String[] args) throws IOException {
		int f=0,s=1,i,t=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number \n");
		int n=Integer.parseInt(br.readLine());
		System.out.print("The fibonacci series is ");
		for(i=0;i<n+3;i++) {
			System.out.print(" "+f);
			t=f+s;
			f=s;
			s=t;
		}
	}
}
