package thirteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class af {
	public static void main(String[] args) throws IOException {
		int f=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number \n");
		int n=Integer.parseInt(br.readLine());
		while(n>0)
		{
			f=f+n;
			n--;
		}
		System.out.println("The sum is "+f);
	}

}
