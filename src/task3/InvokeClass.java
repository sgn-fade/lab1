package task3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class InvokeClass {
    public static void outputMethodResult(Object classObject, String methodName, TypeSaver []args){
        Class<?> ClassObj = classObject.getClass();
        Object[] paramValues = new Object[args.length];
        Class<?>[] paramTypes = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            paramTypes[i] = args[i].getRealType();
            paramValues[i] = args[i].getClassObject();
        }
        Method method;

        try {
            method = ClassObj.getMethod(methodName, paramTypes);
        } catch (NoSuchMethodException e) {
            System.out.println("invalid method");
            return;
        }
        try {
            method.invoke(classObject, paramValues);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
