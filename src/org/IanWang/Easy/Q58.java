package org.IanWang.Easy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q58 {
    public static void main(String[] args) {
        lengthOfLastWord2("luffy is still joyboy");
    }
    public static int lengthOfLastWord(String s) {
        char[]chr = s.toCharArray();
        List<Integer> placeList = IntStream.range(0, chr.length).filter(i->chr[i] == ' ').boxed()
                .collect(Collectors.toList());
        int theLast = placeList.get(placeList.size()-1)+1;
            return s.length()-theLast;
    }

    public static int lengthOfLastWord2(String s) {
        s=s.trim();
        int count = 0;
        char[] chr = s.toCharArray();
        for(int i = chr.length-1 ; i>0 ; i--){
            System.out.println("i = "+ i );
            count++;
            System.out.println("count = " + count);
            System.out.println("chr[i] = " + chr[i]);
            if(chr[i]==' ')
                return count;
        }
        return chr.length;
    }
}
