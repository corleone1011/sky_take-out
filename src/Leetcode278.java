public class Leetcode278 {

    public int firstBadVersion(int n) {
        int l=0;
        int h=n-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(isBadVersion(mid)==false){
                l=mid+1;
            }
            if(isBadVersion(mid)==true){
                h=mid-1;

            }
        }

      return l;
    }
    public boolean isBadVersion(int n) {
        return false;
    }
}
