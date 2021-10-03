package lesson_6;

public class Main {

    public static void main (String[] args) {
        final int TREES = 20;
        int balance = 0;
        int disbalance = 0;
        for (int i = 0; i < TREES; i++) {

            MyTreeMap<Integer, String> map = new MyTreeMap<>();
            while (map.height() < 6) {
                int random = MyTreeMap.rnd(-100, 100);
                map.put(random, "value");
            }
            if (map.isBalanced()){
                balance++;
            } else {
                disbalance++;
            }
        }
        System.out.println("balance: " + balance + ". disbalance: " + disbalance);
    }
}