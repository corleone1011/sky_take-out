import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String line1="a123a";
        String line2="B456B";
        String line3="21312";
        String line4="21312";
        String line5="%213%";
        String line6="sd231";
        String regex1=new String("(.).+\\1");
        Pattern p=Pattern.compile(regex1);
        System.out.println("1"+line1.matches(regex1));
        System.out.println("2"+line2.matches(regex1));
        System.out.println("3"+line3.matches(regex1));
        System.out.println("4"+line4.matches(regex1));
        System.out.println("5"+line5.matches(regex1));
        System.out.println("6"+line6.matches(regex1));


    }
}
