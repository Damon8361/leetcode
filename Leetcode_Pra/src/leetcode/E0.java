package leetcode;

/**
 * @author Damon
 * @version 1.0
 */
public class E0 {
    public static void main(String[] args) {
        String[] s = {"dog","racecar","car"};
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.longestCommonPrefix(s));

    }
}// "static void main" must be defined in a public class.
//暴力解法

class Solution3 {
    public String longestCommonPrefix(String[] strs) {
        String shortest = strs[0];
        int longStr = strs.length;
        for(int i = 0; i < longStr; i++){
            if(shortest.length() > strs[i].length()){
                shortest = strs[i];
            }
        }

        String res = shortest;

        for(int j = 0; j < strs.length; j++){
            if(!strs[j].startsWith(res)){
                res = res.substring(0,res.length() -1 );
            }
        }

        return res;
    }
}