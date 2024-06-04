import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {

        String line1= "aaa123aaa";
        String line2="B34564B";
        String line3="2k1312k";
        String line4="aaa213aab";
        String line5="%%213%k";
        String line6="sd231";
        String regex1=new String("((.+)\\2*).+\\1");
        Pattern p=Pattern.compile(regex1);
        System.out.println("1"+line1.matches(regex1));
        System.out.println("2"+line2.matches(regex1));
        System.out.println("3"+line3.matches(regex1));
        System.out.println("4"+line4.matches(regex1));
        System.out.println("5"+line5.matches(regex1));
        System.out.println("6"+line6.matches(regex1));


    }




}
