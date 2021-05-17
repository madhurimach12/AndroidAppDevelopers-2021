package com.android.internshipprogram;

public class aadharUtil {
    public static boolean condition(String[] Aadhaar_digits){
        if(checkFirstCondition(Aadhaar_digits)==checkSecondCondition(Aadhaar_digits)==true) {
            return true;
        }
        return false;
    }
    public static boolean checkFirstCondition(String[] Aadhaar_digits)
    {

        for(int i=0;i<Aadhaar_digits.length;i++)
        {
            if(Aadhaar_digits[i].length()!=4)
            {
                return false;
            }
        }

        return true;
    }

    public static boolean checkSecondCondition(String[] Aadhaar_digits)
    {

        for(int i=0;i<Aadhaar_digits.length;i++)
        {
            char[] chars = Aadhaar_digits[i].toCharArray();
            for(char digi:chars)
            {
                if(!Character.isDigit(digi)){
                    return false;
                }
            }
        }
        return true;
    }


}
