import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean result = num > -15 && num < 13 || num > 14 && num < 17;
        result = result || num > 18;
        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}