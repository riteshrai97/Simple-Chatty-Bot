import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();
        System.out.println(str.substring(firstIndex, secondIndex + 1));
    }
}