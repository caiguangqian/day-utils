package com.onion.day.utils.datastructortest;

import java.util.Arrays;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: 两个有序数组合并
 * @date 2020/6/7 11:39
 **/
public class MyClass {
    public static void main(String[] args) {
        int[] num1=new int[]{1,2,4,6,7,123,411,5334,1414141,1314141414};
        int[] num2=new int[]{0,2,57,89,113,5623,6353,134134};
        //两个变量用于两个集合应该被比较的索引（存入新集合就加一）
        int a=0;
        int b=0;
        int[] num3=new int[num1.length+num2.length];
        for(int i=0;i<num3.length;i++){
            if(a<num1.length&&b<num2.length){
                if(num1[a]>num2[b]){
                    num3[i]=num2[b];
                    b++;
                }else {
                    num3[i]=num1[a];
                    a++;
                }
            }else if (a<num1.length){
                num3[i]=num1[a];
                a++;
            }else if(b<num2.length){
                num3[i]=num2[b];
                b++;
            }
        }
        System.out.println("排序后："+ Arrays.toString(num3));
    }
}
