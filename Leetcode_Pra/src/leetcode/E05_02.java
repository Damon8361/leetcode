package leetcode;

public class E05_02 {
    public static void main(String[] args) {

        Solution0502 solution0502 = new Solution0502();
        System.out.print(solution0502.printBin(0.1));
    }
}
class Solution0502 {
    public String printBin(double num) {
        StringBuilder sb = new StringBuilder("0.");
        while (sb.length() <= 32 && num != 0) {
            num *= 2;
            int digit = (int) num;
            sb.append(digit);
            num -= digit;
        }
        return sb.length() <= 32 ? sb.toString() : "ERROR";
    }
}
