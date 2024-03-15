package task5;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args){
        func fun = new func();
        Calc e = (Calc) Proxy.newProxyInstance(fun.getClass().getClassLoader(),
                fun.getClass().getInterfaces(), new Handler(fun));
        e.f(1.0);
    }
}
