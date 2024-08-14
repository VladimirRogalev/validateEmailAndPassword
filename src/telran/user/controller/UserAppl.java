package telran.user.controller;

public class UserAppl {

	public static void main(String[] args) {
		boolean check = validateEmail("peter@gmail.com");
		System.out.println(check);
		check = isPasswordValid("sdffDe4rtr!e");
		System.out.println(check);
		// Test2
		check = validateEmail("peterPArker");
		System.out.println(check);
		check = isPasswordValid("123A");
		System.out.println(check);
	}

	/*
	 * TODO: 1. @ exists and only one (done) 2. dot after @ (done) 3. after last dot
	 * minimum 2 symbols (done) 4. alphabetic, digits, _, - , ., @ (done)
	 */
	private static boolean validateEmail(String email) {
		if (email.matches("^[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}$") /* && email.contains(".") */) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * Qwerty1@
	 * 
	 * The password must be at least 8 characters long. The password must contain at
	 * least one digit. The password must contain at least one uppercase letter. The
	 * password must contain at least one lowercase letter. The password must
	 * contain at least one special symbol from the set: !%@$&.
	 */
	private static boolean isPasswordValid(String password) {
//		if (password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$\r\n")){
//			return false;
//				} 
//		else {
//			return true;
//		}

		if (password.length() < 8) {
			return false;
		} 
		
		boolean digit = false;
		boolean lowerCase = false;
		boolean upperCase = false;
		boolean symbols= false;
		String symbolString = "!%@$&";
		for (int i = 0; i < password.length(); i++) {
			char a = password.charAt(i);
			if (Character.isDigit(a)) {
				digit= true;
			} else if (Character.isLowerCase(a)) {
				lowerCase = true;
			} else if ( Character.isUpperCase(a)) {
				upperCase = true;
			}
			else  if (symbolString.indexOf(a) != -1){
				symbols = true;
			}
			}
		return digit & lowerCase & upperCase & symbols;
		} 

}
