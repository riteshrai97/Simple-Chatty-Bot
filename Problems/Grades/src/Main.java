import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;
        for (int i = 0; i < total; i++) {
            int grade = scanner.nextInt();
            if (grade == 2) {
                d += 1;
            } else if (grade == 3) {
                c += 1;
            } else if (grade == 4) {
                b += 1;
            } else {
                a += 1;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}