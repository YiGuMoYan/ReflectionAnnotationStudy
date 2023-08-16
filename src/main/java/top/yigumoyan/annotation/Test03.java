package top.yigumoyan.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation02 {
    /**
     * 注解的参数： 参数类型 + 参数名 ()
     *
     * @return
     */
    String name() default "";

    int age() default 0;

    // 如果默认值为 -1，则代表不存在
    int id() default -1;

    String[] schools();
}

@Target(value =  {ElementType.TYPE, ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {
    String value();
}

public class Test03 {
    /**
     * 注解可以显示赋值，如果没有默认值，我们必须给注解赋值
     */
    @MyAnnotation02(name = "张三", schools = {"西北大学", "西工大"})
    public void test01() {
    }

    @MyAnnotation03("张三")
    public void test02() {
    }
}
