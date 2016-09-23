package com.lh.aop;

import com.lh.aop.beans.Calculator;
import com.lh.aop.beans.CalculatorImpl;
import com.lh.aop.impl.AfterHandlerImpl;
import com.lh.aop.impl.BeforeHandlerImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minim on 2016/9/23.
 */
public class ProxyFactoryTest {
    @Test
    public void getProxy() throws Exception {
        CalculatorImpl calcImpl = new CalculatorImpl();
        BeforeHandler before = new BeforeHandlerImpl();
        AfterHandler after = new AfterHandlerImpl();
        List<AbstractHandler> handlers = new ArrayList<AbstractHandler>();
        handlers.add(before);
        handlers.add(after);
        Calculator proxy = (Calculator) ProxyFactory.getProxy(calcImpl,
                handlers);
        int result = proxy.calculate(20, 10);
    }

}