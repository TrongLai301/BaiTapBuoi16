package BaiTap3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlInfomationExample {

    public static void main(String[] args) {
        try{
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
            sc.useDelimiter("\\Z");
            String content = sc.next();
            sc.close();
            content = content.replaceAll("<img[^>]*>","");
//            Pattern pattern= Pattern.compile("<a href=\"/the-gioi/ukraine-neu-dieu-kien-tien-quyet-dam-phan-cham-dut-xung-dot-voi-nga-20230526063545560.htm\">(.*?)</a>");
//            Pattern pattern= Pattern.compile("<a href=\"/the-gioi/ukraine-bac-tin-tong-tham-muu-truong-trong-thuong-do-cuoc-tap-kich-cua-nga-20230525103753058.htm\">((?:(?!</?a)[\\s\\S])*)</a>(?!.*?<img.*?>)");
//            Pattern pattern = Pattern.compile("<a href=\"/the-gioi/ukraine-neu-dieu-kien-tien-quyet-dam-phan-cham-dut-xung-dot-voi-nga-20230526063545560.htm\">(.*?)</a>(?!.*?<img.*?>)");
            Pattern pattern = Pattern.compile("<a href=\"/the-gioi/ukraine-neu-dieu-kien-tien-quyet-dam-phan-cham-dut-xung-dot-voi-nga-20230526063545560.htm\">(?!<img.*?>)(.*?)</a>");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()){
                System.out.println(matcher.group(1));
            }


            Pattern pattern1 = Pattern.compile("<a href=\"/the-gioi/diem-nong-moi-gay-tranh-cai-giua-cac-dong-minh-phuong-tay-cua-ukraine-20230522104127102.htm\">(?!<img.*?>)(.*?)</a>");
            Matcher matcher1 = pattern1.matcher(content);
            while (matcher1.find()){
                System.out.println(matcher1.group(1));
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}





