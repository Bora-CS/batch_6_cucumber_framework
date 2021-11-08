
public class replace {

public static void main(String[] args) {
	String Password= "Hello";
	String replacePassword= "kugghlh";
	 
	System.out.println(newPassword(Password, replacePassword));
	}
public static String SetGivenPassword(String password) {
	return password;
}
public static String runWithAstrict(String replacePassword) {
	return replacePassword;
}
public static String newPassword(String password, String replacePassword ) {
	password= password.replaceAll(password, replacePassword);
	return password;
}
}

