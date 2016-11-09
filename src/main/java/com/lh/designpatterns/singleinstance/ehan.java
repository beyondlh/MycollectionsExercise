package com.lh.designpatterns.singleinstance;

/**
 * Created by lh on 2016/11/9.
 * 类加载的时候，e已经初始化了。
 */
public class ehan {
    private static ehan e = new ehan();

    private ehan() {

    }

    public static ehan getInstance() {
        return e;
    }
}
