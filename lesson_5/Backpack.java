package lesson_5;

public class Backpack {
    int carrying;
    private Item [] cargo;


    public Backpack(Item [] cargo, int carrying) throws IllegalArgumentException{
        if (carrying <= 0){
            throw new IllegalArgumentException("carrying <=0");
        }else if (cargo.length <= 0){
            throw new  ArrayIndexOutOfBoundsException("Item [] cargo isEmpty");
        }
        this.carrying = carrying;
        this.cargo = cargo;
    }

    int maxSum(int price, int carrying){
        if(price < 0){
            return 0;
        }
        if (cargo[price].wt > carrying){
            return maxSum(price -1, carrying);
        }else {
            return Math.max(maxSum(price - 1, carrying),
                    maxSum(price - 1, carrying - cargo[price].wt)+ cargo[price].cost);
        }
    }
}
