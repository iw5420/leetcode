package org.IanWang.Easy;

public class Q495 {
    public static void main(String[] args) {
        String example = "abab";
        // String example = "abcabcabc";
        boolean ans = repeatedSubstringPattern(example);
        System.out.println(ans);
    }

    public static boolean repeatedSubstringPattern(String s) {

        if(s.equals(""))return false;

        int len = s.length();
        int[] temp = new int[len];
        int[] next=getNext(temp,s, len);
        // 比對表最後一欄位置不為-1 且 長度能被最大重複組除盡
        if (next[len-1] != -1 && len % (len - (next[len-1]+1)) == 0) {
            return true;
        }

        return false;
    }


    public static int[] getNext(int[]next, String s, int len){
        // 1 初始化賦予-1值
        next[0] = -1;
        int j = -1;
        char[] chars = s.toCharArray();

        for(int i = 1; i<len; i++){
            // 2 前後綴不相等時, 往前跳到指定位置再進行下迴圈(比對)
            while(j>=0&&chars[i]!=chars[j+1]){
                j = next[j];
            }
            // 3 前後綴相等, j++, 並將值放到next表中
            if(chars[i]==chars[j+1]){
                j++;
            }
            next[i]=j;
        }
        return next;
    }
}
