package leetcode;

public class Sort01 {

    public static void main(String[] args) {


        int[] arr1 = {122,321,23,52,1,66,2,6};
        Sort sort = new Sort();
        int[] arr2 = new int[arr1.length];

        arr2 = sort.sortArray(arr1);



        for (int arr3 : arr2){
            System.out.println(arr3);
        }
    }
}

class Sort {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + ((right - left) >> 1);
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    //归并
    public void merge(int[] arr,int left, int mid, int right) {
        //第一步，定义一个新的临时数组
        int[] temparr = new int[right -left + 1];
        int temp1 = left;
        int temp2 = mid + 1;
        int index = 0;
        //对应第二步，比较每个指针指向的值，小的存入大集合
        while (temp1 <= mid && temp2 <= right) {
            if (arr[temp1] <= arr[temp2]) {
                temparr[index++] = arr[temp1++];
            } else {
                temparr[index++] = arr[temp2++];
            }
        }
        //对应第三步，将某一小集合的剩余元素存到大集合中

        while(temp1 <= mid){
            temparr[index++] = arr[temp1++];
        }
        while(temp2 <= right){
            temparr[index++] = arr[temp2++];
        }
        for(int i = 0; i < temparr.length; i++){
            arr[i + left] = temparr[i];
        }

    }
}