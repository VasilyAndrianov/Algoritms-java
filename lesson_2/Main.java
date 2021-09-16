import java.util.Random;

public class Main {


    public static void main(String[] args) {
        int n = 100000;
        Random random = new Random();
        MyArrayList<Integer> arr = new MyArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(random.nextInt(100000));
        }
//      System.out.println(mal);
        arr.selectionSort();        //заняло 14 сек
//      arr.insertionSort();        // заняло 18 сек
//      arr.bubbleSortOptimized();  // заняло 54сек
        System.out.println(arr);


    }
}