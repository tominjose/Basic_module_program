package company_questions1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());;
		int a=n%10;
		int b=n/10;
		int t=0;
		if(b==1)
		{
			switch(a)
			{
			 case 1:
			 case 2:
			     t=t+6;
			     break;
			 case 3:
			 case 4:
			 case 8:
				 t=t+8;
			 case 5:
			 case 6:
			 case 9:
				 t=t+7;
				 break;
			 case 7:
				 t=t+9;
				 break;
			}
		}
		else
		{
		 switch(a)
		 {
		  case 1:
		  case 2:
		  case 6:
		  case 10:
			t=t+3;
			break;
		  case 4:
		  case 5:
		  case 9:
			t=t+4;
		    break;
		  case 3:
		  case 7:
		  case 8:
			t=t+5;
			break;
		 }
		switch(b)
		{
		case 2:
		case 3:
		case 4:
		case 8:
		case 9:
			t=t+6;
			break;
		case 5:
		case 6:
			t=t+5;
			break;
		case 7:
			t=t+7;
			break;
		}
		
	}
	System.out.println(t);
	}	
}
