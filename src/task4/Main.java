package task4;


public class Main {
    public static void main(String[] args){
        Object[] array = ArrayClass.getArray(ArrayClass.createArray(int.class, 5));
        System.out.println(ArrayClass.getArrayString(new Object[]{array}));

        array = (Object[]) ArrayClass.changeSize(array, 7);

        System.out.println(ArrayClass.getArrayString(array));

    }
}
