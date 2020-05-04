import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            int value = scanner.nextInt();
            if (value % 6 == 0) {
                sum += value;
            }
        }
        System.out.println(sum);
    }
}