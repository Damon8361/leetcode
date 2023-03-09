package leetcode;

/**
 *m * m <= ans
 *(m + 1) * (m + 1) > ans
 */
public class E68 {
    public static void main(String[] args) {
        E_68 e68 = new E_68();
        int ans = e68.mySqrt(8);
        System.out.println(ans);
    }
}
class E_68 {
    public int mySqrt(int x) {


        if(x == 0) return 0;


        int left = 1;

        int right = x;

        int mid = right >> 1;


        while(left <= right){
            mid = left+ ((right-left) >> 1 );
            if(mid <= x/mid ){
                if((mid + 1) > x / (mid + 1)){
                    return mid;
                }
                left = mid + 1;
            }else{
                right = mid - 1;
            }

        }
        return -1;
    }
}


