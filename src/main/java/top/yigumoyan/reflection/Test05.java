package top.yigumoyan.reflection;

public class Test05 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.m);

        /**
         * 1.加载到内存，会产生一个对应类的 Class 对象
         * 2.链接，链接结束后 m = 0
         * 3.初始化，初始化结束后 m = 100
         */
    }
}

class A {
    static int m = 100;

    static {
        System.out.println("A类静态代码块");
        m = 300;
    }

    public A() {
        System.out.println("A类构造方法");
    }

}