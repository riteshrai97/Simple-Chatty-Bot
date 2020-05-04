import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int var = scanner.nextInt();
            if (var % 4 == 0 && var > max) {
                max = var;
            }
        }
        System.out.println(max);
    }
}