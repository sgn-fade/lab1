package task4;

import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class ArrayClass {
    public static Object createArray(Class<?> classObject, int args) {
        return Array.newInstance(classObject, args);
    }
    public static Object changeSize(Object array, int new_size) {
        int length = Math.min(Array.getLength(array), new_size);
        Object new_array =  Array.newInstance(array.getClass().getComponentType(), new_size);
        java.lang.System.arraycopy(array, 0, new_array,0,  length);
        return new_array;
    }

    public static String getArrayString(Object[] array){
        return Arrays.deepToString(array);
    }
    public static Object[] getArray(Object arr){
        if (arr instanceof Object[])
            return (Object[])arr;
        int arrlength = Array.getLength(arr);
        Object[] outputArray = new Object[arrlength];
        for(int i = 0; i < arrlength; ++i){
            outputArray[i] = Array.get(arr, i);
        }
        return outputArray;
    }
}
