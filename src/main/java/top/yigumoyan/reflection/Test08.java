package top.yigumoyan.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("top.yigumoyan.reflection.User");

        User user = new User();
        c1 = user.getClass();

        // 获得类的名字
        // 获得类的名字 + 包名字
        System.out.println(c1.getName());
        // 获得类名
        System.out.println(c1.getSimpleName());

        // 获得类的属性
        // 只能找到 public 属性
        Field[] fields = c1.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // 获得所有属性
        fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // 获得制定属性
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        // 获得本类的方法
        // 获取本类及其父类的 public 方法
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println("正常的:" + method);
        }
        // 获取本类的所有方法
        methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("DeclaredMethods:" + method);
        }

        // 获得本类的制定方法
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        // 获得制定的构造器
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        constructors  = c1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("#" + constructor);
        }
    }
}
