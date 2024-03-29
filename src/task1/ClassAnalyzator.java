package task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class ClassAnalyzator {
    private static String dataField;

    public static String getDataField() {
        return dataField;
    }

    public static void analyze(String classPath) {
        try {
            Class<?> classObject = Class.forName(classPath);
            createMetaData(classObject);
        } catch (ClassNotFoundException e) {
            System.out.println("Class was not found");
        }
    }

    public static void analyze(Class<?> classObject) {
        createMetaData(classObject);
    }

    public static void createMetaData(Class<?> classObject) {
        StringBuilder stringData = new StringBuilder();
        stringData.append("package ").append(classObject.getPackageName()).append("\n");
        stringData.append(Modifier.toString(classObject.getModifiers())).append(" ").append(classObject.getSimpleName());

        stringData.append(" implements ");
        Class<?>[] interfaces = classObject.getInterfaces();
        for (Class<?> inter : interfaces) {
            stringData.append("  ").append(inter.getSimpleName());
        }

        stringData.append(" { \n//fields\n");
        Field[] declaredFields = classObject.getDeclaredFields();
        for (Field field : declaredFields) {
            stringData.append("  ").append(field).append("\n");
        }
        stringData.append("//constructors\n");
        Constructor<?>[] Constructors = classObject.getConstructors();
        for (Constructor<?> constructor : Constructors) {
            stringData.append("  ").append(constructor).append("\n");
        }

        stringData.append("//methods\n");
        Method[] declaredMethods =
                classObject.getDeclaredMethods();
        for (Method method : declaredMethods) {
            stringData.append("  ").append(method).append("\n");
        }
        dataField = stringData.toString();
        //System.out.println(stringData);
    }
}
