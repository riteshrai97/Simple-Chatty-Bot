import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int large = 0;
        int small = 0;
        int perfect = 0;
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int value = scanner.nextInt();
            if (value == 1) {
                large += 1;
            } else if (value == -1) {
                small += 1;
            } else {
                perfect += 1;
            }
        }
        System.out.println(perfect + " " + large + " " + small);
    }
}