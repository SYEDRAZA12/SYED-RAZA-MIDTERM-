package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        System.out.print(factRecursion(3));


    }

    public static int factRecursion(int n){
        if(n==1){

            return 1;
        }
        return n * factRecursion(n-1);
    }

    public static int factIterative(int n){
        int product = 1;

        for (int i=1; i <= n; i++)
            product *= i;

        return product;
    }
}
