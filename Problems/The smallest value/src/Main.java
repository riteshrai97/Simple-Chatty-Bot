import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        boolean flag = false;
        int n = 1;
        long factorial = 1;
        while (!flag) {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            if (factorial <= m) {
                n++;
                factorial = 1;
            } else {
                flag = true;
            }
        }
        System.out.println(n);
    }
}