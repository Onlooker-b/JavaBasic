package Day21.a04recursionalgorithm;

public class Demo2 {
    public static void main(String[] args) {
        /*
         * 用递归求5的阶层
         * 5! = 5 * 4!
         * 4! = 4 * 3!
         * 3! = 3 * 2!
         * 2! = 2 * 1!
         * 1! = 1 (出口)
         */
        System.out.println(getFactorialRecursion(5));
    }
    public static int getFactorialRecursion(int number){
        if (number == 1) {
            return 1;
        }
        return number * getFactorialRecursion(number-1);
    }
}
