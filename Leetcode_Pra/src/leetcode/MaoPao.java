package leetcode;

import java.util.Arrays;

/**
 * @author Damon
 * @version 1.0
 */
public class MaoPao {
    public static void main(String[] args) {


    }

    /**    求arr[L...R] 范围上的最大值 N   */
    public static int BinarySearch(int[] arr, int L, int R) {
        int mid = L + (R - L) >> 1; //求中点 等价于 L + (R - L)/2 右移1位 相当于 除2 (比 (R-L)/2 快)
        int leftMax = BinarySearch(arr, L, mid); //求出左边最大值
        int rightMax = BinarySearch(arr, mid + 1, R); // 求出右边最大值
        return Math.max(leftMax, rightMax); //比较两个最大值

    }

    public static int getMax(int[] arr) { //调用二分法搜索
        return BinarySearch(arr, 0, arr.length - 1);
    }
}