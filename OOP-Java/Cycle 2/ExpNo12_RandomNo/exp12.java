import java.util.Random;
import java.util.Scanner;
class exp12
{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of random numbers : ");
        int n=sc.nextInt();
        System.out.println("Random numbers between 1 and 100:");
        for (int i = 0; i < n; i++)
        {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println(randomNumber);
        }
    }
}

