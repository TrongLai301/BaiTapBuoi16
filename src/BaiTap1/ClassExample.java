package BaiTap1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String STUDENT_REGEX = "[CAP]\\d{4,4}[GHIK]";
    public ClassExample(){

    }
    public boolean validate(String regex){
        pattern = Pattern.compile(STUDENT_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
