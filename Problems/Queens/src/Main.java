import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int diffX = Math.abs(x1 - x2);
        int diffY = Math.abs(y1 - y2);
        if (x1 == x2 || y1 == y2 || diffX == diffY) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}