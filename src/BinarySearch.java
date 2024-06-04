import com.sun.source.tree.Tree;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        int in=0;
        in=sc.nextInt();
        System.out.println(MyBinarySearch(arr,in));


    }//返回找到值的索引
    public  static int MyBinarySearch(int [] arr, int target) {
        int begin=0;
        int end=arr.length-1;
        while(true){
            if(begin>end)  return -1;//处理特殊情况


            int mid=0;
            mid=(begin+end)/2;


            if(target>arr[mid]){
                begin=mid+1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target==arr[mid]){
                return mid;
            }

        }



    }
}
