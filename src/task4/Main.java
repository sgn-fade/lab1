package task4;


import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] arr1 = (int[]) ArrayClass.createArray(int.class,3);
        arr1[0] = 1; arr1[1] = 2; arr1[2] = 3;
        System.out.println(Arrays.toString(arr1));
        arr1 = (int[]) ArrayClass.changeSize(arr1, 5);
        arr1[3] = 4; arr1[4] = 5;
        System.out.println(Arrays.toString(arr1));
        arr1 = (int[]) ArrayClass.changeSize(arr1, 2);
        System.out.println(Arrays.toString(arr1));
        Object arr2 =  ArrayClass.createArray(int.class, 2, 2);
        ArrayClass.getArrayString(arr2);


    }
}
