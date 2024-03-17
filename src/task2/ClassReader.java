package task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.Scanner;

public abstract class ClassReader {
    public static void outputFields(Object valueClass) {
        Class<?> classObject = valueClass.getClass();

        Field[] declaredFields = classObject.getDeclaredFields();

        for (Field field : declaredFields) {
            try {
                field.setAccessible(true);
                Object value = field.get(valueClass);
                System.out.println(field.getName() + " = " + value);

            } catch (IllegalAccessException e) {
                return;
            }
        }
    }
    public static void outputMethods(Object valueClass) {
        Class<?> classObject = valueClass.getClass();
        Method[] declaredMethods = classObject.getDeclaredMethods();

        int i = 0;
        for (Method method : declaredMethods) {
            System.out.println(++i + ")" + method);
        }

        System.out.println( "enter method: (1 - " + declaredMethods.length + ")\n");

        Scanner in = new Scanner(System.in);
        int methodNumber = in.nextInt();

        if (methodNumber >= declaredMethods.length || methodNumber < 0){
            System.out.println("wrong number");
            return;
        }
        try {
            declaredMethods[methodNumber - 1].invoke(valueClass);
        } catch (IllegalAccessException | InvocationTargetException e){
            throw new RuntimeException(e);
        }catch (IllegalArgumentException e){
            System.out.println("can't invoke method with arguments");
        }
    }
}
