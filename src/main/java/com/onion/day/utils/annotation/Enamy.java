package com.onion.day.utils.annotation;

import java.lang.annotation.*;

//定义了注解的生命周期为运行时
@Retention(RetentionPolicy.RUNTIME)
//定义了注解的作用域为方法
@Target(ElementType.METHOD)
//标识该注解可以被JavaDoc记录
@Documented
public @interface Enamy {
    /*
     * 接口描述
     * 定义一个元素desc，用来描述被修饰的方法
     **/
    String desc() default "";
}
