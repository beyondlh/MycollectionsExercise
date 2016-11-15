package com.lh.serializable;

import com.lh.Apple;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by lh on 2016/11/2.
 */
public class MySerializableTest {
    public static void main(String[] args) {
/*        Apple apple = new Apple(2);

        *//*只序列化属性*//*
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\Apple.txt"))) {
            objectOutputStream.writeUTF(String.valueOf(apple.getWeight()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\Apple.txt"))) {
            objectOutputStream.writeObject(apple);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\Apple.txt"))) {
            Apple a = (Apple) objectInputStream.readObject();
            System.out.print(a.getBird().num);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

