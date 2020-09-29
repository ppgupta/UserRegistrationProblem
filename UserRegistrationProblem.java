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
	public static boolean isValidEmail(String email) {
		//String regex="^[abc]+?[a-z]{2,}";
      String regex=	"^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

		Pattern p=Pattern.compile(regex);
		if(email==null) {
			return false;
		}
		Matcher m=p.matcher(email);
		return m.matches();
	}
	public static boolean isValidMobileNum(String mobile) {
		//String regex="^[abc]+?[a-z]{2,}";
      String regex=	"^((\\+)?(\\d{2}[\\s]))?(\\d{10}){1}?$";

		Pattern p=Pattern.compile(regex);
		if(mobile==null) {
			return false;
		}
		Matcher m=p.matcher(mobile);
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
	//UC3
	System.out.println("Enter your Email Id: ");
	String email =sc.nextLine();
	
	if(isValidEmail(email)) {
		System.out.println("Valid Email");
	}
	else {
		System.out.println("Invalid Email");
	}
	//UC4
	System.out.println("Enter your Mobile No: ");
	String mobile =sc.nextLine();
	
	if(isValidMobileNum(mobile)) {
		System.out.println("Valid Number");
	}
	else {
		System.out.println("Invalid Number");
	}
}
}
