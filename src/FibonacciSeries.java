import java.util.Scanner;

public class FibonacciSeries {
        public static void main(String[] args){

            int totalNumbers;

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of fibonacci numbers you need: ");
            totalNumbers = scan.nextInt();

            int firstPrecedingNumber = 0, secondPrecedingNumber = 1, currentNumber;
            int count = 2;
            System.out.println("First "+totalNumbers+" Fibonacci numbers are");
            System.out.println(firstPrecedingNumber+"\n"+secondPrecedingNumber);

            for(; count<totalNumbers; count++)
            {
                currentNumber = firstPrecedingNumber+secondPrecedingNumber;
                System.out.println(currentNumber);

                firstPrecedingNumber = secondPrecedingNumber;
                secondPrecedingNumber = currentNumber;
            }

            scan.close();
        }

    }
