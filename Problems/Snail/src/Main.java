import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int d = (h - b - 1) / (a - b) + 1;
        //int temp = (h - b) % (a - b);
        //d +=  temp % (temp + 1);
        System.out.println(d);
    }
}