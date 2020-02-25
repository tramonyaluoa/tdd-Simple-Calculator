import static java.lang.System.*;

public class Calculator {

    public static int add(int ...numbers) {
        int sum = 0;
        for (int i = 0; i<numbers.length; i++) {
            sum = sum+numbers[i];
        }
        return sum;
    }

    public static int multiply(int ...numbers) {
        int product = 1;
        for (int i = 0; i<numbers.length; i++) {
            product = product*numbers[i];
        }
        return product;
    }

    public static void main(String[] args) {
        out.println(add(1, 2));
        out.println(add(-1,-1));
        out.println(add(1,2,3,4,5));
        out.println("");
        out.println(multiply(1, 3));
        out.println(multiply(-1,3));
        out.println(multiply(1,2,3,4,5));
    }
}
