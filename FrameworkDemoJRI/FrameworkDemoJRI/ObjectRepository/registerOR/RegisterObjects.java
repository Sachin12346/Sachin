package registerOR;

public interface RegisterObjects {

	
	public String txtbxName=".//*[@id='signup_name']";
	public String txtbxMobile=".//*[@id='signup_mobileno']";
	public String txtbxEmail=".//*[@id='signup_email']";
	public String txtbxPassword=".//*[@id='signup_password']";
	public String checkbxSubscribe=".//*[@id='checkbox1']";
	public String checkbxTermsConditions=".//*[@id='checkbox']";
	public String btnCreateAccount=".//*[@id='imgbtnSubmit']";
	
	public String errorRegisterBlankName=".//*[@id='nameTD']/span";
	public String errorRegisterBlankMobile=".//*[@id='mobilenoTD']/span";
	public String errorRegisterBlankEmail=".//*[@id='emailTD']/span";
	public String errorRegisterBlankPassword=".//*[@id='signup_password']"; 
	
	String expUrl="https://www.justrechargeit.com/myaccount_directory.aspx";
	//Error Messages
	public String expmsgRegisterBlankName="Enter your name";
	public String expmsgRegisterBlankMobile="Enter mobile no.";
	public String expmsgRegisterBlankEmail="Enter your email id";
	public String expmsgRegisterBlankPassword="Enter your password";
	public String expmsgRegisterInvalidName="Enter correct name";
	public String expmsgRegisterInvalidMobile="Enter valid 10 digit mobile no.";
	public String expmsgRegisterInvalidEmail="Enter valid email id";
	public String expmsgRegisterInvalidPassword="Enter 6-digit numeric characters only";
	
		
	
	
	
	
}
