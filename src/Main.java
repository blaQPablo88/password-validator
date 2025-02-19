
public class Main {
    public static void main(String[] args) {
        String password = "123456Ab";
        if (validate_length(password) && validate_case(password) && validate_digit(password) && special_characters(password)) {
            System.out.println("Password Is Secured");
        } else {
            System.out.println("Password Not Secured");
        }

    }

    // method to check if password is at least 8 characters long
    public static boolean validate_length(String password) {
        return password.length() >= 8;
    }

    // method to validate if password contains both uppercase and lowercase letters
    public static boolean validate_case(String password) {
        // a boolean to check if string is uppercase
        boolean pass_lowerCase = false, pass_upperCase = false;

        for (char pass_char : password.toCharArray()) {
            if (Character.isUpperCase(pass_char)) {
                pass_upperCase = true;
            }
            if (Character.isUpperCase(pass_char)) {
                pass_lowerCase = true;
            }
            if (pass_lowerCase && pass_upperCase) {
                return true;
            }

        }
        return false;
    }

    // has at least one digit
    public static boolean validate_digit(String password) {
        for (char pass_char : password.toCharArray()) {
            if (Character.isDigit(pass_char)) {
                return true;
            }
        }
        return false;
    }

    //has at least 1 special character
    public static boolean special_characters(String password) {
        String specialChar = password.replaceAll("[a-zA-Z0-9]", "");
        for (char pass_char : specialChar.toCharArray()) {
            if (!Character.isLetterOrDigit(pass_char)) {
                return true;
            }
        }
        return false;
    }

}