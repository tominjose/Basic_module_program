package seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class com {

	public static void main(String[] args) throws IOException {
		int f=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of alphabets in your name \n");
		int n=Integer.parseInt(br.readLine());
		while(n>0)
		{
			f=f*n;
			n--;
		}
		System.out.println("The number of combinations is "+f);

	}

}
