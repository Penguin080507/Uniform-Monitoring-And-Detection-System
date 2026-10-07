package StaffOperations;


public class DigitChecker {
    public static boolean isDigit(String str)
    {
        boolean flag = true;
        try
        {
            Long num = Long.parseLong(str);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
            flag = false;
        }
        return flag;
    }

    
}
