package com.onion.day.utils.datastructortest;

import java.awt.print.PrinterAbortException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: 时间格式转换
 *
 * @date 2020/6/7 17:26
 **/
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }

    public void qianxu(TreeNode treeNode){
    }

    public static void fun(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        String newDate;
        try{
            newDate=sdf.format(new SimpleDateFormat("yyyyMMdd").parse("20181104"));
            System.out.println(newDate);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        fun();
    }
}
