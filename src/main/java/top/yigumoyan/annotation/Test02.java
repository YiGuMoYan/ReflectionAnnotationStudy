package top.yigumoyan.annotation;

import java.lang.annotation.*;

/**
 * 定义一个注解
 * Target: 我们的注解可以用在那些地方
 * Retention: 我们的注解在什么地方有效
 * Documented: 标识号我们的注解生成在我们的 Javadoc 中
 * Inherited: 子类，可以集成 Java 的父类
 */
@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface MyAnnotation {

}

/**
 * 测试元注解
 */
public class Test02 {

    @MyAnnotation
    public void test() {

    }
}
