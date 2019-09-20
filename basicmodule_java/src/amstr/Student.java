package amstr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {

	public static void main(String[] args) throws IOException {
		int i=0,t=0;
		double result=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(br.readLine());
		int real=number,rem=number;
		while(real!=0)
		{
			t++;
			real=real/10;
		}
		while(rem!=0)
		{
			i=rem%10;
			result=result+(int)Math.pow(i, t);
			rem=rem/10;
		}
		if(result==number)
		{
			System.out.println("The given number is amstrong");
		}
		else
		{
			System.out.println("The given number is not amstrong");
		}
		
	    

	}

}
