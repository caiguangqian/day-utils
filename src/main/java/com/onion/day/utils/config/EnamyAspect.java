package com.onion.day.utils.config;

import com.alibaba.fastjson.JSON;
import com.onion.day.utils.annotation.Enamy;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/5/26 12:40
 **/
@Aspect
@Component
public class EnamyAspect {
    private final static Logger logger = LoggerFactory.getLogger(EnamyAspect.class);

    //切到所有加@Enamy注释的地方
    @Pointcut("@annotation(com.onion.day.utils.annotation.Enamy)")
    public void Enamy(){
    }

    @Around("Enamy()")
    public Object arroud(ProceedingJoinPoint point) throws Throwable {

        Long begin=System.currentTimeMillis();
        ServletRequestAttributes attributes=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request=attributes.getRequest();
        //从切面得到sognature
        Signature signature=point.getSignature();
        MethodSignature methodSignature=(MethodSignature) signature;
        //反射得到方法
        Method method=methodSignature.getMethod();
        Enamy enamy=method.getAnnotation(Enamy.class);

        //接口信息描述
        String desc=enamy.desc();

        logger.info("============请求开始===========");
        logger.info("请求链接：{}",request.getRequestURL().toString());
        logger.info("接口描述：{}",desc);
        logger.info("请求类型：{}",request.getMethod());
        logger.info("请求方法：{}",signature.getDeclaringTypeName());
        logger.info("请求ip：{}",request.getRemoteAddr());
        logger.info("请求入参：{}", JSON.toJSONString(point.getArgs()));
        Object result=point.proceed();

        //请求结束时间线
        Long end=System.currentTimeMillis();
        //请求耗时
        logger.info("请求耗时：{} ms",end-begin);
        logger.info("请求返回：{}",JSON.toJSONString(result));
        logger.info("============请求开始===========");
        return result;
    }

}
