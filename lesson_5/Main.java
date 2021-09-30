package lesson_5;

public class Main {

    public static void main(String[] args) {
        Item [] items = {
        new Item ("Nout", 2000, 3000),
        new Item ("phone", 1000, 1000),
        new Item ("the player", 1500, 1500),
        new Item ("watch", 500, 1200)};


//        Item[] items1 = new Item[0];
        Backpack backpack = new Backpack( items,3000);
        System.out.println(backpack.maxSum(items.length -1, backpack.carrying ));


//        System.out.println(Expo.Expo(12,2));
    }


}
