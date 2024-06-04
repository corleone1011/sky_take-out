public class BubbleSort {


    public static void main(String[] args) {
                   int [] arr={3,45,3,645,1,2,88,23112,22};
                   //相邻的元素两两比较
                   //较大者换到右边

                   for(int i=0;i<arr.length-1;i++){
                       for(int j=0;j<arr.length-1;j++) {
                           if (arr[j] > arr[j + 1]) {
                               int temp = arr[j];
                               arr[j] = arr[j + 1];
                               arr[j + 1] = temp;
                               //把他们交换
                           }
                       }
                       }
                       for(int k=0;k<arr.length;k++){
                           System.out.println(arr[k]);

                       }
                   }

    }

