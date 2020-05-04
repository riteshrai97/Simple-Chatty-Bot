import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int bridges = scanner.nextInt();
        int count = 0;
        boolean crash = false;
        while (count < bridges) {
            count++;
            int height = scanner.nextInt();
            if (height <= n) {
                crash = true;
                break;
            }
        }
        if (crash) {
            System.out.println("Will crash on bridge " + count);
        } else {
            System.out.println("Will not crash");
        }
    }
}