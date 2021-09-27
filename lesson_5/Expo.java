package lesson_5;

public class Expo {


    protected static int Expo(final int num,final int expo){
        if (expo == 0){
            return 1;
        } else if (expo == 1){
            return num;
        }return Expo(num,(expo - 1)) * num;
    }


}
