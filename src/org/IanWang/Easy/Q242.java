package org.IanWang.Easy;

public class Q242 {
    public static void main(String[] args) {
        char s = 'c';
        System.out.println(s-'a');
    }

    public boolean isAnagram(String s, String t) {
        if(s==null&&t==null)return true;
        if(s==null||t==null)return false;
        if(s.length()!=t.length())return false;

        int[] dict = new int[26];
        for(int i = 0; i<s.length();i++){
            dict[s.charAt(i)-'a']++;
            dict[t.charAt(i)-'a']--;
        }
        for(int i : dict){
            if(i!=0)return false;
        }
        return true;
    }
}
