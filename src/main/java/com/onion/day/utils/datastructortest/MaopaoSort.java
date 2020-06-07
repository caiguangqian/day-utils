package com.onion.day.utils.datastructortest;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: 冒泡排序  数组倒序  快速排序
 * @date 2020/6/7 11:54
 **/
public class MaopaoSort {
    public static void main(String[] args) {
        int[] array=new int[]{24, 69, 80, 57, 13};
        int[] array2=new int[array.length];
        //array2=sort(array);
        //array2=reverse(array);
        quickSort(array,0,4);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }


    }
    /**
     2      * 冒泡排序
     3      * 循环比较相邻的两个数，将较大的数放在后面
     4      * @param nums 待排序数值序列
     5      */
    private static int[] sort(int[] nums){
        int len=nums.length;
        if(len==0||len==1){
            return nums;
        }
        for(int i=0;i<len-1;i++) {
            for (int j = 0; j < len-i-1; j++) {
                if(nums[j+1]<nums[j]){
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }
        }
        return nums;
    }

    private static int[] reverse(int[] a){
        int[] b=a;
        for(int s=0,e=b.length-1;s<e;s++,e--){
            int t=b[s];
            b[s]=b[e];
            b[e]=t;
        }
        return b;
    }

    private static  void quickSort(int[] a,int low,int high){
        int i=low;
        int j=high;
        if(i>j){
            return;
        }
        int k=a[i];
        while (i<j){
            while (i<j&&a[j]>k){
                j--;
            }
            while (i<j&&a[i]<=k){
                i++;
            }
            if(i<j){
                int swap=a[i];
                a[i]=a[j];
                a[j]=swap;
            }
        }
        k=a[i];
        a[i]=low;
        a[low]=k;
        quickSort(a,low,i-1);
        quickSort(a,i+1,high);

    }
}
