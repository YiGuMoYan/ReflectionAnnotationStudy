package top.yigumoyan.annotation;

import java.util.ArrayList;
import java.util.List;

public class Test01 extends Object {

    /**
     * 重写
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Deprecated 不推荐程序员使用，但是可以使用，或者存在更好的方式
     */
    @Deprecated
    public static void test01() {
        System.out.println("Deprecated");
    }

    /**
     * 镇压警告
     */
    @SuppressWarnings("all")
    public void test02() {
        List list = new ArrayList<>();
    }

    public static void main(String[] args) {
        test01();
    }
}