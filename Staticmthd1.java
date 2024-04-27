
package PracticeSession1;

import java.util.Scanner;

public class Staticmthd1{
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
	
public static void main(String args[]) {
	Staticmthd1 obj=new Staticmthd1();
	obj.run();
}
public void run() {
Scanner scan=new Scanner(System.in);
System.out.println("Enter your Company : ");
System.out.println("Enter your age : ");
String cName=scan.nextLine();
int 	aAge=scan.nextInt();
if(cName.equalsIgnoreCase("TCS") && aAge<=21) {
System.out.println("You are eligible to 10K run");	
}
else if(cName.equalsIgnoreCase("TCS") && (aAge>=21&&aAge<41)){
	System.out.println("You are eligible to 5K run");	
}
else if(cName.equalsIgnoreCase("TCS") && aAge>=41&&aAge<50) {
	System.out.println("You are eligible to 3K run");
}
else {
	System.out.println("You might not from Tcs or you might not have right age");
}
}
}
	