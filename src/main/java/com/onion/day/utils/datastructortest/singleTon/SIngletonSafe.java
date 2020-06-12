package com.onion.day.utils.datastructortest.singleTon;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: 加锁双重判断2懒加载，防止并发线程安全问题
 * @date 2020/6/12 12:14
 **/
public class SIngletonSafe {
    private static SIngletonSafe instance;
    private SIngletonSafe(){}
    private static SIngletonSafe getInstance(){
        if(instance==null){
            synchronized (SIngletonSafe.class){
                if(instance==null){
                    return new SIngletonSafe();
                }
            }
        }
        return instance;
    }
}
