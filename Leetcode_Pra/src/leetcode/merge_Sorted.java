package leetcode;

/**
 * @author Damon
 * @version 1.0
 */
public class merge_Sorted {
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,1,4,2,6,7};
        Solution6 solution6 = new Solution6();
   solution6.sortArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

class Solution6{
    public int[] sortArray(int[] nums) {
        BinarySearch(nums, 0, nums.length-1);
        return nums;
    }
    public void BinarySearch(int[] nums, int L, int R){
        if (L < R) {
            int mid = L + ((R - L) >> 1); // L + (R - L)/2相当于将一个数组分成了两部分，左边的部分加上右边的部分除2。 安全，效率高，不会有越界错误  ==> (R - L) /2  会有越界错误，不安全
            BinarySearch(nums, L, mid);

            BinarySearch(nums, mid + 1, R);

          merge(nums, L, mid, R);
        }
    }
    public static void merge(int[] nums, int L , int mid ,int R){
        int[] newNums = new int[R - L + 1];

        int p1 = L;//左边指针
        int p2 = mid +1;//右边指针
        int i = 0;//新数组指针

        while(p1 <= mid && p2 <= R){
            newNums[i++] = nums[p1] <= nums[p2] ? nums[p1++] : nums[p2++];
        }

        while(p1 <= mid){
            newNums[i++] = nums[p1++];
        }
        while(p2 <= R){
            newNums[i++] = nums[p2++];
        }

        for(int m = 0; m < newNums.length; m++){
            nums[m]=newNums[m];
        }
    }
}