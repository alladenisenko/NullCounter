/**
 * Created by student on 17.07.2018.
 */
public class Main {

    public static void main(String[] args) {
        NullCounter nullCounter = new NullCounter();
        nullCounter.fillArr(50);
        System.out.println();
        new NullCounter().fillArr(50);
        int[] arr;
        int counter;
        arr = nullCounter.fillArr(50);
        System.out.println();
        counter=nullCounter.countNullElements(arr);
        System.out.println("koli4estvo 0 " + counter);
    }
}
