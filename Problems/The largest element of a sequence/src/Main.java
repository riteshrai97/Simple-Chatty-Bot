import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int num = 0;
        do {
            num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        } while (num != 0);
        System.out.println(max);
    }
}