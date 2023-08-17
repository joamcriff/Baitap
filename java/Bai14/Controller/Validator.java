package Bai14.Controller;



import Bai14.Exception.FullNameException;
import Bai14.Exception.InvalidDOBEException;
import Bai14.Exception.InvalidPhoneNumberException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Validator {
    public static boolean validateDateOfBirth(String dateOfBirth) throws InvalidDOBEException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            sdf.parse(dateOfBirth);
            return true;
        } catch (ParseException e) {
            throw new InvalidDOBEException("Invalid date of birth format. Please use dd/MM/yyyy.");
        }
    }

    public static boolean validateFullName(String fullName) throws FullNameException {
        if (fullName.length() < 10 || fullName.length() > 50) {
            throw new FullNameException("Invalid full name length.");
        }
        return true;
    }

    public static boolean validatePhone(String phone) throws InvalidPhoneNumberException {
        String[] validPrefixes = {"090", "098", "091", "031", "035", "038"};

        if (phone.length() != 10) {
            throw new InvalidPhoneNumberException("Invalid phone number length.");
        }

        boolean isValidPrefix = false;
        for (String prefix : validPrefixes) {
            if (phone.startsWith(prefix)) {
                isValidPrefix = true;
                break;
            }
        }

        if (!isValidPrefix) {
            throw new InvalidPhoneNumberException("Invalid phone number prefix.");
        }

        if (!phone.matches("\\d+")) {
            throw new InvalidPhoneNumberException("Phone number must contain only digits.");
        }
        return true;
    }
}
