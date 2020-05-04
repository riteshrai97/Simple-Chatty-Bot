import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int num1 = number % 10;
        int num2 = number % 100 / 10;
        int num3 = number % 1000 / 100;
        int num4 = number % 10_000 / 1000;
        if (num1 == num4 && num2 == num3) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}