package bridgelabz;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationProblem {
	public static boolean isValidFirstName(String firstName ) {
		String regex="^[A-Z]{1}[a-z]{2,}";
		Pattern p=Pattern.compile(regex);
		if(firstName==null) {
			return false;
		}
		Matcher m=p.matcher(firstName);
		return m.matches();
	}
	public static boolean isValidLastName(String lastName ) {
		String regex="^[A-Z]{1}[a-z]{2,}";
		Pattern p=Pattern.compile(regex);
		if(lastName==null) {
			return false;
		}
		Matcher m=p.matcher(lastName);
		return m.matches();
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your first name: ");
	String firstName=sc.nextLine();
	
	if(isValidFirstName(firstName)) {
		System.out.println("Valid firstname");
	}
	else {
		System.out.println("Invalid first name");
	}
	//UC2
	System.out.println("Enter your Last name: ");
	String lastName=sc.nextLine();
	
	if(isValidLastName(lastName)) {
		System.out.println("Valid lastname");
	}
	else {
		System.out.println("Invalid last name");
	}
}
}
