package casestudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class list {
	
	public static void main(String[] args) throws IOException{
		String name;
		String ad;
		String no;
		String email;
		String proof;
		String proofid;
		String choice;
		int id[]=new int[10];
		String b;
		int i=1,c=0,j;
		String[] n=new String[10];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Registration");
		do
		{
		  System.out.println("Enter your name");
		  n[i]=br.readLine();
		  System.out.println("Enter your address");
		  ad=br.readLine();
		  System.out.println("Contact number");
		  no=br.readLine();
		  System.out.println("E-Mail ID");
		  email=br.readLine();
		  System.out.println("Enter proof type");
		  proof=br.readLine();
		  System.out.println("Enter proof id");
		  proofid=br.readLine();
		  System.out.println("Thank you for registering. Your id is "+ i);
		  i++;
		  System.out.println("Do you want to continue registration(y/n)?");
		  b=br.readLine();
		}while(b.equals("y")==true);
		c=i;
		list(n,i,c);
	 }

	private static void list(String[] n, int i,int c) {
		System.out.println("Customers list");
		System.out.println("The registered customers are");
		System.out.println("Customer ID    Customer name");
		for(int j = 1;j<c;j++)
		{
		  	System.out.println(j+"                "+n[j]);
		}
		
	}
}

