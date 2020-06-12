package com.onion.day.utils.datastructortest.singleTon;

import java.sql.Statement;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/6/12 12:10
 **/
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy(){
    }
    private static SingletonLazy getInstance(){
        if(instance==null){
            return new SingletonLazy();
        }
        return instance;
    }
}
