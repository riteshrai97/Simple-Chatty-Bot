import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean flag = false;
        int num = 1;
        while (!flag) {
            if (num * num <= number) {
                System.out.println(num * num);
                num++;
            } else {
                flag = true;
            }
        }
    }
}