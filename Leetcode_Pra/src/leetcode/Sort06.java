package leetcode;

/**
 * Heap sort
 */
public class Sort06 {
    public static void main(String[] args) {
        int[] rawArr = {123, 1, 2, 6, 7, 12, 534, 85, 3};
        Sort_06.heapSort(rawArr);


        for (int i = 0; i < rawArr.length; i++) {
            System.out.println(rawArr[i]);
        }
    }

    class Sort_06 {
        public static void heapSort(int[] arr) {
            if (arr == null || arr.length < 2) {
                return;
            }
            for (int i = 0; i < arr.length; i++) { //O(N)
                heapInsert(arr, i);
            }
            int heapSize = arr.length;
            swap(arr, 0, --heapSize);
            while (heapSize > 0) {
                heapify(arr, 0, heapSize);
                swap(arr, 0, --heapSize);
            }
        }


        //某个数现在处在index位置，往上继续移动
        public static void heapInsert(int[] arr, int index) {
            while (arr[index] > arr[(index - 1) / 2]) {
                swap(arr, index, (index - 1) / 2);
                index = (index - 1) / 2;
            }
        }

        public static void heapify(int[] arr, int index, int heapSize) {

            int left = index * 2 + 1;  //左孩子的下标
            while (left < heapSize) {//下方还有孩子时候

                //两个孩子中，谁的值大，将下标给largest
                int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;

                //父亲和较大孩子之间进行比较，值大的，将下标给largest
                largest = arr[largest] > arr[index] ? largest : index;
                if (largest == index) {
                    break;
                }
                swap(arr, largest, index);
                index = largest;
                left = index * 2 + 1;
            }
        }

        public static void swap(int[] arr, int i, int j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
}
