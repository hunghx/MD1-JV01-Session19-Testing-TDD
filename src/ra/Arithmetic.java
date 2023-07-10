package ra;

public class Arithmetic {
    // kiểm tra 1 số truyền vào là chẵn(true) hay lẻ (false)
    public static boolean isEven(int number){
        // tách biến
        boolean check = number != 0 && number % 2 == 0; // kiểm tra xem chẵn hay lẻ
        return check ?true:false;
    }
    // kiểm tra số nguyên tố
    public static boolean isPrime(int number){
        if(number<2){
            return false;
        }
        for (int i =2; i < number; i++) {
            if(number%i ==0){
                return false;
            }
        }
        return true;
    }
}
