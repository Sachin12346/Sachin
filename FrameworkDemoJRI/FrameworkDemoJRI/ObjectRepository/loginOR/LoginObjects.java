package loginOR;

public interface LoginObjects {
	String txtboxUserName="txtUserName";
	String txtboxPassword="txtPasswd";
	String btnSignIn="imgbtnSignin";
	String linksignOut="jriTop_signOut";

	//Error messages
	String errorInvalidLoginPass="MessageCaption";
	String errorBlankEmail="MessageCaption2";
	String errorBlankPassword="MessageCaption3";
	//String errorBlankEmail="MessageCaption2";

	//Error messages
	String expmsgInvalidEmailPassword="Invalid Login Id / Password.";
	String expmsgBlankEmailError="Enter your email";
	String expmsgBlankPasswordError="Enter your password";
	String expmsgInvalidEmail=" Enter valid email for login";
	String expmsgWrongPassword="Login Information is wrong. Account will be blocked after 5 attempts.";



}
