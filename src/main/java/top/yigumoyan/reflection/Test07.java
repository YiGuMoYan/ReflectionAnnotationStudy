package top.yigumoyan.reflection;

public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 获取系统加载器类的父类加载器 --> 扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        // 获取扩展类加载器的父类加载器 --> 根加载器(c/c++)
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        // 测试当前加载器是哪个加载器加载的
        ClassLoader classLoader = Class.forName("top.yigumoyan.reflection.Test07").getClassLoader();
        System.out.println(classLoader);

        // 测试 JDK 内部类是哪个加载器加载的
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);

        // 如何获得系统类加载器的加载路径
        System.out.println(System.getProperty("java.class.path"));

    }
}
