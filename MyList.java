/*In this example, we define a generic class MyList with 
    a type parameter T that extends the Number class. 
    This means that we can only use types that extend 
    Number, such as Integer or Double, as the type argument 
    when creating an instance of this class. */

public class MyList<T extends Number> {
    private T[] array;

    public MyList(int size) {
        array = (T[]) new Number[size];
    }

    public void set(int index, T element) {
        array[index] = element;
    }

    public T get(int index) {
        return array[index];
    }
}
