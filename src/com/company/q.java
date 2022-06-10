package com.company;

import java.util.Arrays;

public class q {
    public static void main(String[] args) {
        int[] nums={-1,1,0,-3,3};
        karde(nums);
    }

    static void karde(int[] arr){
        int[] ans=new int[arr.length];
        for(int lp=0;lp<ans.length;lp++){
            int c=1;
            for(int rp=ans.length-1;rp>=0;rp--){
                if(lp!=rp){
                    c*=arr[rp];
                }
            }ans[lp]=c;
        }
        System.out.println(Arrays.toString(ans));
    }
}
