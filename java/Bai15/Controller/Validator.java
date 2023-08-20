package Bai15.Controller;



import Bai15.Exception.FullNameException;
import Bai15.Exception.InvalidDOBEException;

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
}
