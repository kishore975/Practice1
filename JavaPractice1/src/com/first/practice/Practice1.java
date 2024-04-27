package com.first.practice;

import java.util.Scanner;

public class Practice1 
{
				//Print age eligibility starts
					
				/*public static void main(String args[]) {
						voteEligibility();	
					}
					public static void voteEligibility()
					{
						Scanner scan=new Scanner(System.in);
						System.out.print("Enter your age: ");
						int age=scan.nextInt();
						if(age>=18) {
							System.out.println("You are eligible to vote");	
						}
						else {
							System.out.println("You are just "+age+" So need to wait "+(18-age)+" years");
						}
				}*/
					
				//Print age eligibility ends	

				//Return age eligibility starts	
					
				/*public static void main(String args[]) {
					System.out.println(voteEligibility());
				}
				public static String voteEligibility() {
					Scanner scan=new Scanner(System.in);
					System.out.println("Enter you age:");
					int age=scan.nextInt();
					if(age>=19) {
						 return "You are eligible to vote";	
					}
					else {
						return "You are just "+age+" So need to wait "+(19-age)+" years";
					}
				}*/

				//Return age eligibility ends
					
				public static void main(String args[]) 
				{
					Practice1 obj=new Practice1();
					obj.run();
					
				}
				
				public void run() 
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter your Company : ");
				String cName=scan.nextLine();
				System.out.println("Enter your age : ");
				
				int 	aAge=scan.nextInt();
if(cName.equalsIgnoreCase("TCS") && aAge<60) {
				if(cName.equalsIgnoreCase("TCS") && aAge<=21) 
				{
				System.out.println("You are eligible to 10K run");
				System.out.println("NOW");
				}
				else if(cName.equalsIgnoreCase("TCS") && (aAge>=21&&aAge<41))
				{
					System.out.println("You are eligible to 5K run");
					System.out.println("NOW");
				}
				
				else if(cName.equalsIgnoreCase("TCS") && aAge>=41&&aAge<50) {
					System.out.println("You are eligible to 3K run");
					System.out.println("NOW");
				}
				Scanner scan1=new Scanner(System.in);
				System.out.println("Enter your State : ");
				String state=scan1.nextLine();
				
				if(state.equalsIgnoreCase("Telangana"))
				{
					Scanner scan2=new Scanner(System.in);
					System.out.println("Enter your City : ");
					String city=scan2.nextLine();
					if(city.equalsIgnoreCase("Gachibowli")) 
					{
						System.out.println("You should visit to Participate in Synergy Park");	
					}
					else if(city.equalsIgnoreCase("Hitechcity"))
					{
						System.out.println("You should visit to Participate in Kohinoor Park");	
					}
						
					else if(city.equalsIgnoreCase("Raidurg")) 
					{
						System.out.println("You should visit to Participate in Deccan Park");
					}
					else if(city.equalsIgnoreCase("Adibatla")) 
					{
						System.out.println("You should visit to  Participate in Adibatla Office");
					}
					else {
						System.out.println("No such location in Telangana");
					}
				}
				else {
					System.out.println("You are not from Telangana");
				}
				
					
}
else {
	System.out.println("Not match to Company or Age");
}
				
				
				
	}
							
}			



