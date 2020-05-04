import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstHour = scanner.nextInt();
        int firstMin = scanner.nextInt();
        int firstSec = scanner.nextInt();
        int nextHour = scanner.nextInt();
        int nextMin = scanner.nextInt();
        int nextSec = scanner.nextInt();
        System.out.println((nextHour - firstHour) * 3600 + (nextMin - firstMin) * 60 + nextSec - firstSec);
    }
}