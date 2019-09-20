package fjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		String Name;
		String Age;
		String Degree;
		String Branch;
		String Contact;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Name=br.readLine();
		Age=br.readLine();
		Degree=br.readLine();
		Branch=br.readLine();
		Contact=br.readLine();
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Degree: "+Degree);
		System.out.println("Branch: "+Branch);
		System.out.println("Contact: "+Contact);
		
	}

}
