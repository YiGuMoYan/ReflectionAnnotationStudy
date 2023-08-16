package top.yigumoyan.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

// 反射操作注解
public class Test12 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("top.yigumoyan.reflection.Stu");

        // 通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        // 获得注解 value 的值
        TableInterface table = (TableInterface) c1.getAnnotation(TableInterface.class);
        System.out.println(table.value());

        // 获得类指定的注解
        Field name = c1.getDeclaredField("name");
        FieldInterface annotation = name.getAnnotation(FieldInterface.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());
    }
}

@TableInterface("db_stu")
class Stu {
    @FieldInterface(columnName = "db_id", type = "int", length = "10")
    private int id;
    @FieldInterface(columnName = "db_age", type = "int", length = "10")
    private int age;
    @FieldInterface(columnName = "db_name", type = "varchar", length = "3")
    private String name;


    public Stu() {
    }

    public Stu(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stu{" + "id=" + id + ", age=" + age + ", name='" + name + '\'' + '}';
    }
}

/**
 * 类名的注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableInterface {
    String value();
}

/**
 * 属性的注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldInterface {
    String columnName();
    String type();
    String length();
}