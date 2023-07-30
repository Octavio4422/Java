package junitEjApren03;

public class PasswordValidator {
	public boolean longitudMinima(String pass) {
		return pass.length() > 8;
	}
	
	public boolean caracExpe(String pass) {
		
//        String strSource = "aA1~!@#$%^&*()_+{}[]:;,.<>/?-";
        
//        String strPattern = "[~!@#$%^&*()_+{}\\[\\]:;,.<>/?-]";
		return pass.matches("^(?=.*[\\W_]).+$");
	}
	
	public boolean mayusculas(String pass) {
		return pass.matches("^(?=.*[A-Z]).+$");
	}
}
