package businesslogic;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
public class RegistrationValidation{
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		if(validPassword(password, confirmPassword)&&validEmail(email)) {
			return true;
		}
		else
			return false;
		
	}
	private boolean validPassword(String password, String confirmPassword) {
		String pass="((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,20})";
		 Pattern p=Pattern.compile(pass);
		 if(password==null||confirmPassword==null) {
			 return false;
		 }
		 else if(p.matcher(password).matches()==true&&p.matcher(confirmPassword).matches()==true) {
			 if(password==confirmPassword) {
				 return true;
			 }
			 else 
				 return false;
		 }
		 else 
			 return false;
	}
	private boolean validEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$";
		Pattern p=Pattern.compile(emailRegex);
		if(email==null) {
			return false;
		}
		else if(p.matcher(email).matches()==true) {
			return true;
		}
		else
			return false;
	}
}
