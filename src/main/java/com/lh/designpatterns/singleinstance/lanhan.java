package com.lh.designpatterns.singleinstance;

/**
 * Created by lh on 2016/11/9.
 * 懒汉模式，只用用到的时候才初始化
 */
public class lanhan {
    private static lanhan db = null;

    public static lanhan getInstance() {
        if (db == null) {
            db = new lanhan();
        }
        return db;
    }

    private lanhan() {

    }
}
