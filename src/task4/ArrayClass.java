package task4;

import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class ArrayClass {
    public static Object createArray(Class<?> classObject, int... args) {
        return Array.newInstance(classObject, args);
    }
    public static Object changeSize(Object array, int... new_size) {

        Object new_array =  Array.newInstance(array.getClass().getComponentType(), new_size);
        int length = Math.min(Array.getLength(array), Array.getLength(new_array));

        java.lang.System.arraycopy(array, 0, new_array,0,  length);
        return new_array;
    }

    public static void getArrayString(Object array){
        System.out.println(Arrays.deepToString((Object[]) array));
    }
}
