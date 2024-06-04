import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test603  {
    public static void main(String[] args) throws IOException {
        URL url=new URL("https://applicationnewjw.ecnu.edu.cn/eams/home.action?url=publicSearch");
        URLConnection con=url.openConnection();
        BufferedReader in=new BufferedReader(new InputStreamReader(con.getInputStream()));
        String line;
        String Redex="28";
        Pattern p=Pattern.compile(Redex);

        while( (line=in.readLine()) != null ){
            Matcher m=p.matcher(line);
            while(m.find()) {

                System.out.println(m.group());
            }
        }
        in.close();

    }
}
