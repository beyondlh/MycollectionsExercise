package  com.lh.aop.beans;

public class CalculatorImpl implements Calculator {

    public int calculate(int a, int b) {
    	System.out.println("**********Actual Method Execution**********");
        return a/b;
    }

}
