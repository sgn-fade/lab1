package task4;

import java.lang.reflect.Array;

public abstract class ArrayClass {
    public static Object createArray(Class<?> classObject, int[] args) {
        return Array.newInstance(classObject, args);
    }
    public static void changeSize(Object[] array, int new_size) {
        Object[] new_array = (Object[]) Array.newInstance(array.getClass(), new_size);
        java.lang.System.arraycopy(array, 0, new_array,0,  array.length);
    }

    public static String getArrayString(Object array){
        return array.toString();
    }
}
