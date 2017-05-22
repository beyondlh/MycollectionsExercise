package com.lh.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

/**
 * Created by lh on 2017/5/22.
 * 参考https://my.oschina.net/lifany/blog/875769
 */
public class TypeCleanAndTGET {
    public static void main(String[] args) {
        Class c1 = new ArrayList<Integer>().getClass();
        Class c2 = new ArrayList<String>().getClass();
        System.out.println(c1 == c2);




        /*我们可能期望能够获得真实的泛型参数，但是仅仅获得了声明时泛型参数占位符。getTypeParameters 方法的 Javadoc 也是这么解释的：仅返回声明时的泛型参数。所以，通过 getTypeParamters 方法无法获得运行时的泛型信息。*/
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, String> map = new HashMap<Integer, String>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));


//        注意后面的大括号,实际上是创建了个匿名内部类，这个类是HashMap的子类
        Map<String, Integer> mapInnerClass = new HashMap<String, Integer>() {
            public int a = 0;

            public int cal() {
                tes t = new tes();
                t.cal2();
                return a;
            }

            class tes {
                public tes() {
                }

                public int cal2() {
                    return a;
                }
            }
        };
        Map<String, Integer> mapInnerClass2 = new HashMap<String, Integer>();

        Type type = mapInnerClass.getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        for (Type typeArgument : parameterizedType.getActualTypeArguments()) {
            System.out.println(typeArgument.getTypeName());
        }

    }
}
