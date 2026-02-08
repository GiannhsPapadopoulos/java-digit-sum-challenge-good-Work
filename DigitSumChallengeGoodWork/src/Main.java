

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));
    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }


        int sum = 0;
//        int temp = number; // antigrafh toy number ama thelo na kratao to number ametablhto

        while (number > 9) {
            sum = sum + (number % 10); // pairno to deksiotero psifio
            number = number / 10; // afairei to deksiotero psifio
        }

        sum += number; // otan einai monopsifios

        return sum;
    }
}