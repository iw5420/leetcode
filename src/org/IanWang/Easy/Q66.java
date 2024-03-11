package org.IanWang.Easy;

import java.util.Map;

public class Q66 {
    public static void main(String[] args) {
        //int[]intArr = {1,2,3};
        int[]intArr = {9,9};
        plusOne2(intArr);
    }

    public static int[] plusOne(int[] digits) {
        // bad implement for there is the limit of int
        int total = 0;
        int pow = digits.length-1;
        for(int i =0; i<digits.length; i++){
            total = (int) (total + digits[i]*Math.pow(10,pow));
            pow=pow-1;
        }
        System.out.println("total = "+ total);
        char[] charTotal= String.valueOf(total+1).toCharArray();
        int[] num = new int[charTotal.length];

        for (int i = 0; i < charTotal.length; i++){
            num[i] = charTotal[i] - '0';
        }
        return num;
    }

    public static int[] plusOne2(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }if(digits[digits.length-1]==9){
            if(digits.length==1){
                int[] arr=new int[digits.length + 1];
                arr[0]=1;
                return arr;
            }else{
                boolean up = true;
                for(int i = digits.length-1;i>=0;i--){
                    if(i!=0&&digits[i]==9&&up==true){
                        digits[i] = 0;
                        continue;
                    }
                    if(digits[i]!=9&&up==true){
                        digits[i] = digits[i]+1;
                        up = false;
                        return digits;
                    }
                    if(i==0&&up==true&&digits[i]==9){
                        int[] arr=new int[digits.length + 1];
                        arr[0]=1;
                        return arr;
                    }
                }

            }
        }
        return digits;
    }
}
