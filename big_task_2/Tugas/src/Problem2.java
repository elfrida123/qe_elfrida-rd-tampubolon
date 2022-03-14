import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        String line;
        System.out.print("Masukkan kata anda: ");
        Scanner in = new Scanner(System.in);
        line = in.nextLine();
        line = line.toLowerCase();
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (ch == 'o') {
                    ch = '-';
                    System.out.print(ch + " ");
                } else {
                    ch = '.';
                    System.out.print(ch + " ");
                }
            }
        }
    }
}
