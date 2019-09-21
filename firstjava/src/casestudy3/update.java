package casestudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class update {
	public static void main(String[] args) throws IOException{
		String name;
		String ad;
		String no;
		String email;
		String proof;
		String proofid;
		String choice;
		int a[]=new int[20];
		String b;
		int i=0,c=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Registration");
		do
		{
		  i++;
		  System.out.println("Enter your name");
		  name=br.readLine();
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
		  c=c+1;
		  a[i]=c;
		  System.out.println("Thank you for registering. Your id is "+a[i]);
		  System.out.println("Do you want to continue registration(y/n)?");
		  b=br.readLine();
		}while(b=="y");
		  System.out.println("Do you want to update the email id?(yes/no)");
		  choice=br.readLine();
		  if(choice.equals("yes"))
		  {
			  System.out.println("Update Email:");
			  System.out.println("Enter new Email id");
			  email=br.readLine();
			  System.out.println("Email updated");
			  System.out.println("Your details are as follows");
			  System.out.println("Name: "+name);
			  System.out.println("Address: "+ad);
			  System.out.println("Contact Number: "+no);
			  System.out.println("E-Mail ID: "+email);
			  System.out.println("Proof Type: "+proof);
			  System.out.println("Proof id: "+proofid);
		  }
		  else
		  {
			  System.out.println("Your details are as follows");
			  System.out.println("Name: "+name);
			  System.out.println("Address: "+ad);
			  System.out.println("Contact Number: "+no);
			  System.out.println("E-Mail ID: "+email);
			  System.out.println("Proof Type: "+proof);
			  System.out.println("Proof id: "+proofid);  
		  }
		
	}

}
