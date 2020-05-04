import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int ones = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number % 1000 / 100;
        System.out.println(ones * 100 + tens * 10 + hundreds);
    }
}