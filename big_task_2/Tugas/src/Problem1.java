import java.util.Scanner;

public class Problem1 {
    static void JamPasir(int input) {
        int i, j, k;
        for (i = 1; i <= input; i++) {
            for (k = 1; k < i; k++)
                System.out.print(" ");
            for (j = i; j <= input; j++)
                System.out.print("*" + " ");

            System.out.println();
        }
        for (i = input - 1; i >= 1; i--) {
            for (k = 1; k < i; k++)
                System.out.print(" ");
            for (j = i; j <= input; j++)
                System.out.print("*" + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int input;
        System.out.print("Masukkan jumlah input : ");
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        JamPasir(input);
    }
}
