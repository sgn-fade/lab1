package task4;


public class Main {
    public static void main(String[] args){
        Object array = ArrayClass.createArray(int.class, new int[]{5, 2});
        //Object array = ArrayClass.createArray(java.lang.Integer.class, 5);
        System.out.println(ArrayClass.getArrayString(array));
    }
}
