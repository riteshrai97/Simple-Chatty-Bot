import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 1) {
            System.out.print(number + " ");
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number *= 3;
                number += 1;
            }
        }
        System.out.println(number);

    }
}