import java.util.*;
public class Login
{
		Scanner input = new Scanner(System.in);
		String Username;
		String Password;
		String CellPhoneNumber;
		Boolean checkUsername(String Username){
			return Username.contains("_") && Username.length()<=5;
		}
	Boolean checkPasswordComplexity(String Password){
		return Password.length()>=8 && Password.matches(".*[A-Z].*") && Password.matches(".*[0-9].*") && Password.matches(".*[^a-zA-Z0-9].*");
	}
	Boolean checkCellPhoneNumber(String CellPhoneNumber){
		return CellPhoneNumber.matches("^\\+27[0-9]{9}$");
		}
		}
