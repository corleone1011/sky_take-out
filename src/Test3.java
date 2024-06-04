public class Test3 {
    public static void main(String[] args) {
        String s="锤石是是是是是是是是是是傻傻傻傻傻傻傻傻傻傻傻傻傻傻bbbbbbbb";
        String result=s.replaceAll("(.)\\1+","$1");
        System.out.println(result);
    }
}
