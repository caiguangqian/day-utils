package com.onion.day.utils.datastructortest.singleTon;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: 饿汉式单例模式
 * @date 2020/6/12 12:08
 **/
public class Singleton {
    private static Singleton instance=new Singleton();
    private Singleton(){
    }
    public static Singleton getInstance(){
        return instance;
    }
}
