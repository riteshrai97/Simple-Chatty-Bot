import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int cups = scanner.nextInt();
        boolean isItWeekend = scanner.nextBoolean();
        boolean weekday = cups >= 10 && cups <= 20 && !isItWeekend;
        boolean weekend = cups >= 15 && cups <= 25 && isItWeekend;
        System.out.println(weekday || weekend);
    }
}