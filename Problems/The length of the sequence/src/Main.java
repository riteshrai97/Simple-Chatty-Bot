import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int count = 0;
        while (value != 0) {
            count++;
            value = scanner.nextInt();
        }
        System.out.println(count);
    }
}