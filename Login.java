/*
References:


1. Login System Reference (YouTube):
 
Beginner Java - Simple Login Program
 
https://www.youtube.com/watch?v=9YlEpv-FrWU
   
(Shows how to build a Java login system with username/password input)


2. Password Validation Reference (YouTube):

Java Validation: Validating a Password
 
https://www.youtube.com/watch?v=kN8mqSvNFa4
 
(Explains password validation logic using Java regex)


3. Regex Logic Reference (ChatGPT):
 
Used ChatGPT guidance for writing regex for password complexity and input validation
*/

import java.util.*;
public class Login
{
		Scanner input = new Scanner(System.in);
		String registeredUsername;
		String registeredPassword;
		String registeredCellPhoneNumber;
		
		Boolean checkUsername(String Username){
			return Username.contains("_") && Username.length()<=5;
		}
	Boolean checkPasswordComplexity(String Password){
		return Password.length()>=8 && Password.matches(".*[A-Z].*") && Password.matches(".*[0-9].*") && Password.matches(".*[^a-zA-Z0-9].*");
	}
	Boolean checkCellPhoneNumber(String CellPhoneNumber){
		return CellPhoneNumber.matches("^\\+27[0-9]{9}$");
		}
		String registerUser(){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your username");
			String Username = input.nextLine();
			if (!checkUsername(Username))
				{return "Username is not correctly formatted.Must contain underscore and max 5 characters.";
				}
				System.out.println("Enter your password");
		      String Password = input.nextLine();
			  if (!checkPasswordComplexity(Password)){
				  return "Password must be 8-20 chars, include uppercase, number, and special characters.";
				  }
				  System.out.println("Enter your cellphone number");
				  String CellPhoneNumber = input.nextLine();
				  if (!checkCellPhoneNumber(CellPhoneNumber)){
					  return "password must be +27 followed by 9 digits";
					  }
					  registeredUsername = Username;
					  registeredPassword = Password;
					  registeredCellPhoneNumber = CellPhoneNumber;
					  return "Registration successful";
					  }
					  boolean loginUser(){
					  Scanner input = new Scanner(System.in);
					  System.out.println("Enter your username");
					  String Username = input.nextLine();
					  System.out.println("Enter your password");
					  String Password = input.nextLine();  
					  System.out.println("Enter your cellphone number");
					  String CellPhoneNumber = input.nextLine();
						   return Username.equals(registeredUsername) && Password.equals(registeredPassword) && CellPhoneNumber.equals(registeredCellPhoneNumber);
						   }
						   String returnLoginStatus()
					  {	
					  if (loginUser()){return "Welcome " + registeredUsername + " it is great to see you again";
					  }		 
					  else { return "Username or Password incorrect, please try again";}
					  }
					  public static void main(String[]arg){
					  Login login = new Login();
					  System.out.println(login.registerUser());System.out.println(login.returnLoginStatus());
					  }	   
					}
