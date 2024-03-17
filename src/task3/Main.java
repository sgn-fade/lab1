package task3;

    public class Main {
        public static void main(String[] args){
            CalculateClass calc = new CalculateClass();
            InvokeClass.outputMethodResult(calc, "sum", new TypeSaver[]{
                    new TypeSaver(int.class, 1),
                    new TypeSaver(int.class, 2)
            });
            InvokeClass.outputMethodResult(calc, "sum", new TypeSaver[]{
                    new TypeSaver(double.class, 1.0),
                    new TypeSaver(double.class, 2.0)
            });
            InvokeClass.outputMethodResult(calc, "mult", new TypeSaver[]{
                    new TypeSaver(double.class, 1.0),
                    new TypeSaver(double.class, 2.0)
            });
        }
    }
