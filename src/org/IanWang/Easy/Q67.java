package org.IanWang.Easy;

public class Q67 {
    public static void main(String[] args) {
//        String s = "123";
//        System.out.println(s.charAt(2));
        System.out.println(addBinary("11","1"));

    }

    public static String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int i = a.length()-1, y = b.length()-1, carry = 0;
        while(i>=0||y>=0){
            int sum = carry;
            if(i>=0)sum+=a.charAt(i--) - '0';
            if(y>=0)sum+=b.charAt(y--) - '0';
            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry!=0){
            sb.append('1');
        }
        return sb.reverse().toString();
    }


}
