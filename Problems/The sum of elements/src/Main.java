import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean flag = false;
        while (!flag) {
            int number = scanner.nextInt();
            sum += number;
            if (number == 0) {
                flag = true;
            }
        }
        System.out.println(sum);
    }
}