package com.lh.objinit;

/**
 * Created by lh on 2016/10/30.
 */
public class Teacher extends Person {
    // 部门
    String department;
    // 教龄
    int schoolAge;

    public Teacher() {
        System.out.println("构造器Teacher()被调用");
    }

    public Teacher(String name) {
        // 调用父类中的构造器Person(String theName)
        super(name);
        System.out.println("构造器Teacher(String name)被调用");
    }

    public Teacher(int theSchoolAge) {
        schoolAge = theSchoolAge;
    }

    public Teacher(String dept, int theSchoolAge) {
        // 调用本类中重载的构造器Teacher(int theSchoolAge)
        this(theSchoolAge);
        department = dept;
    }

    // 初始化块
    {
        department = "教务部";
        System.out.println("Teacher初始化块执行后：name=" + this.name + " ,age=" + age
                + " ,sex=" + sex);
    }
    static {
        System.out.println("static自由块被执行");
    }
}

class TestInit {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        Teacher t1 = new Teacher();
        System.out.println("");
        System.out.println("------------------------------------");
        Teacher t2 = new Teacher("Tom");
        System.out.println("");
        System.out.println("------------------------------------");
        Teacher t3 = new Teacher("财务部", 20);
    }
}

