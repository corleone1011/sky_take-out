import java.io.IOException;

public class runtime {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        try {
            Runtime.getRuntime().exec("shutdown -a");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String s="/^(s[hz]|S[HZ])(000[\\d]{3}|002[\\d]{3}|300[\\d]{3}|600[\\d]{3}|60[\\d]{4})$/";
    }

}
