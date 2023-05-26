package BaiTap2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String PhoneNumber_Example= "\\([0-9]{2}\\)\\-\\([0][0-9]{9}\\)";
    public PhoneNumberExample(){

    }
    public boolean isValid(String regex){
        pattern = Pattern.compile(PhoneNumber_Example);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
