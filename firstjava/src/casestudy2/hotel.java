package casestudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hotel {

	public static void main(String[] args) throws IOException {
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		int amount,i = 0,k;
		int a[]=new int[26];
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choice;
		do
        {
		 
          System.out.println("Menu");
          System.out.println("1.Book");
          System.out.println("2.Check Status");
          System.out.println("3.Exit");
          System.out.println("Enter your choice");
          choice=Integer.parseInt(br.readLine());
          switch (choice)
          {
            case 1:
            	i++;
            System.out.println("Please choose the service required");
        	System.out.println("AC/non-AC(AC/nAC)");
        	ac=br.readLine();
        	System.out.println("Cot(Single/Double)");
        	cot=br.readLine();
        	System.out.println("With cable connection/without cable connection(C/nC)");
        	cable=br.readLine();
        	System.out.println("Wi-fi needed or not(W/nW)");
        	wifi=br.readLine();
        	System.out.println("Laundry Service needed or not(L/nL)");
        	laundry=br.readLine();
            if(cot.equals("Single")==true)
            {
            	amount=1350;
            }
            else
            {
            	amount=1700;
            }
            System.out.println("The total charge is "+amount);
            System.out.println("The service chosen are ");
            if(cot.equals("Double")==true)
            {
               if(ac.equals("AC")==true)
            	{
            	  System.out.println("Double cot AC room");
            	}
               else
                {
            	  System.out.println("Double cot non AC room");
                }
            }
            else 
            {
            	if(ac.equals("AC")==true)
            	 {
            		System.out.println("Single cot AC room");
            	 }
            	else
            	 {
            		System.out.println("Single cot non AC room");
            	 }
            }
            if(cable.equals("C")==true)
            {
            	System.out.println("Cable connection enabled");
            }
            else
            {
            	System.out.println("Cable connection not enabled");
            }
            if(wifi.equals("W")==true)
            {
            	System.out.println("Wifi enabled");
            }
            else
            {
            	System.out.println("Wifi not enabled");
            }
            if(laundry.equals("L")==true)
            {
            	System.out.println("With laundry service");
            }
            else
            {
            	System.out.println("Without laundry service");
            }
            System.out.println("Do you want to proceed ?(yes/no)");
            String c=null;
            c=br.readLine();
			if(c.equals("yes")==true)
            {
			 a[i]=1;
            }
			System.out.println("Thank you for booking your room number is "+i);
            break;
            case 2:
            	System.out.println("Enter room number");
            	k =Integer.parseInt(br.readLine());
            	if(a[k]!=1)
            	{
            		System.out.println("Room number "+k+" is not booked");
            	}
            	else
            	{
            		System.out.println("Room number " +k+" is  booked");
            	}
           }             
         }while(choice!=3);
		
	}
}

		
	
 


