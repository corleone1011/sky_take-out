public class SingleNonDublicate {
    public int fun1(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (mid % 2 == 1) {
                mid--;
            }//保证mid是个偶数
            if (nums[mid] == nums[mid + 1]) {
                l = mid + 2;
            } else if (nums[mid] != nums[mid + 1]) {
                h = mid;
            }


        }
           return nums[l];

    }

}
