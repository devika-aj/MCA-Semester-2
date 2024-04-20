import maths.Calculator;
import java.util.*;
class exp11
{
        public static void main(String[] args)
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the two numbers : ");
                int m=sc.nextInt();
                int n=sc.nextInt();
                double result = Calculator.add(m, n);
                System.out.println("Result of addition: " + result);

                result = Calculator.subtract(m, n);
                System.out.println("Result of subtraction: " + result);

                result = Calculator.multiply(m, n);
                System.out.println("Result of multiplication: " + result);

                result = Calculator.divide(m, n);
                System.out.println("Result of division: " + result);

        }
}



