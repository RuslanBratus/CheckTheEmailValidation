package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        if (email == null || email.isEmpty() || email == " ")
        {
            return false;
        }
        if (!email.contains("_") || email.contains("_") && email.startsWith("_") || email.contains("$") || email.indexOf("_") == email.indexOf("@")-1)
        {
            return false;
        }


        if (!email.substring(email.indexOf("@")).trim().equals("@epam.com"))
        {
            return false;
        }

        return true;
    }
}





