package com.onion.day.utils.datastructortest.singleTon;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: 静态内部类实现单例，不推荐，防止反射和反序列化攻击
 * @date 2020/6/12 12:17
 **/
public class SingletonStatic {

    private static class SingletonHolder{
        private static SingletonStatic instance=new SingletonStatic();
    }
    private SingletonStatic(){}
    private static SingletonStatic getInstance(){
        return SingletonHolder.instance;
    }
}
