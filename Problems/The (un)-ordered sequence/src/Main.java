import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        boolean asc = false;
        boolean desc = false;
        int number = scanner.nextInt();
        int prevNum = number;
        number = scanner.nextInt();
        if (number == 0) {
            System.out.println("true");
        } else {
            while (true) {
                if (number > prevNum) {
                    asc = true;
                    break;
                } else if (number < prevNum) {
                    desc = true;
                    break;
                } else {
                    prevNum = number;
                    number = scanner.nextInt();
                }
            }
            while (asc) {
                number = scanner.nextInt();
                if (number == 0) {
                    break;
                } else if (number >= prevNum) {
                    prevNum = number;
                    continue;
                } else {
                    asc = false;
                }
            }
            while (desc) {
                number = scanner.nextInt();
                if (number == 0) {
                    break;
                } else if (number <= prevNum) {
                    prevNum = number;
                    continue;
                } else {
                    desc = false;
                }
            }
            if (asc || desc) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}