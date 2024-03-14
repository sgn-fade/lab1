package task2;

public class ValueClass {
    public double x = 6.5;
    public String name = "David";
    private final int y = 56;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void sum(){
        System.out.println("sum x and y: " + (x + y));
    }
}
