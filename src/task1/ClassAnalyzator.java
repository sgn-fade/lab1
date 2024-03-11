package task1;

public abstract class ClassAnalyzator {
    public static void main(String[] args) {

    }

    public static void analyze(String classPath) {
        try {
            Class<?> myClass2 = Class.forName("classPath");
        } catch (ClassNotFoundException e) {
            System.out.println("Class was not found");
        }
    }

    public static void analyze(Class className) {
        return;
    }
}
