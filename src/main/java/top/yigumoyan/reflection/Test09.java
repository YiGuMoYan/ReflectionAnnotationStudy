package top.yigumoyan.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        // 获得 class 对象
        Class c1 = Class.forName("top.yigumoyan.reflection.User");

        // 构造一个对象
        // 本质上调用了无参构造器
        // User user = (User) c1.newInstance();
        // System.out.println(user);

        // 通过构造器创建对象
        // Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        // User user2 = (User) constructor.newInstance("张三", 001, 18);
        // System.out.println(user2);

        // 通过反射调用方法
        // User user3 = (User) c1.newInstance();
        // // 通过反射获取方法
        // Method setName = c1.getDeclaredMethod("setName", String.class);
        // // 激活方法
        // // 对象 方法的值
        // setName.invoke(user3, "张三");
        // System.out.println(user3);

        // 通过反射操作属性
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        // 不能操作私有属性，我们需要关闭安全监测
        name.setAccessible(true);
        name.set(user4, "张三");
        System.out.println(user4);
    }
}
