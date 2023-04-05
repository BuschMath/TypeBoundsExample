public class Main {
    public static void main(String[] args) {
        MyList<Integer> intList = new MyList<>(10);
        MyList<Double> doubleList = new MyList<>(10);

        intList.set(0, 1);
        doubleList.set(0, 3.14);

        int firstInt = intList.get(0);
        double firstDouble = doubleList.get(0);

        System.out.println(firstInt);
        System.out.println(firstDouble);
    }
}

