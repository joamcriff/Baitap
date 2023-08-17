package Bai13.Controller;

import Bai13.Exception.BirthDayException;
import Bai13.Exception.EmailException;
import Bai13.Exception.FullNameException;
import Bai13.Exception.PhoneException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Validator {
    public static boolean validateDateOfBirth(String dateOfBirth) throws BirthDayException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            sdf.parse(dateOfBirth);
            return true;
        } catch (ParseException e) {
            throw new BirthDayException("Invalid date of birth format. Please use dd/MM/yyyy.");
        }
    }

    public static boolean validateEmail(String email) throws EmailException {
        String regex = "^[a-zA-Z0-9+_.-]+@(.+)$";
        if (!email.matches(regex)) {
            throw new EmailException("Invalid email format.");
        }
        return true;
    }

    public static boolean validateFullName(String name) throws FullNameException {
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new FullNameException("Invalid name format. Name should only contain letters and spaces.");
        }
        return true;
    }

    public static boolean validatePhoneNumber(String phoneNumber) throws PhoneException {
        if (!phoneNumber.matches("\\d{10}")) {
            throw new PhoneException("Invalid phone number format. Phone number should have 10 digits.");
        }
        return true;
    }
}
