package task3;

public class TypeSaver {
    private Class<?> realType;
    private Object classObject;

    public TypeSaver(Class<?> realType, Object classObject) {
        this.realType = realType;
        this.classObject = classObject;
    }
    public Class<?> getRealType() {
        return realType;
    }

    public void setRealType(Class<?> realType) {
        this.realType = realType;
    }

    public Object getClassObject() {
        return classObject;
    }

    public void setClassObject(Object classObject) {
        this.classObject = classObject;
    }
}
