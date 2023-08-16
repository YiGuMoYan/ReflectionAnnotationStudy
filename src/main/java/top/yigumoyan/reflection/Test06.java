package top.yigumoyan.reflection;

public class Test06 {
    static {
        System.out.println("main方法被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 1.主动引用
        // Son son = new Son();

        // 反射也会产生主动引用
        // Class aClass = Class.forName("top.yigumoyan.reflection.Son");

        // 不会产生类的引用的
        // System.out.println(Son.b);

        // Son[] array = new Son[5];

        // System.out.println(Son.M);
    }

}

class Father {
    static int b = 2;

    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father {
    static final int M = 1;
    static int m = 100;

    static {
        System.out.println("子类被加载");
        m = 300;
    }
}

