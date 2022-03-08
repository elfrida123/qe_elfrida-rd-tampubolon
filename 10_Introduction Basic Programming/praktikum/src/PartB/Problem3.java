package PartB;

public class Problem3 {
    private static void DrawXYZ(int n){
        int temp = 1;
        char c[] = {'Y', 'Z', 'X'};

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (temp % 3 == 0){
                    System.out.print(c[2]);
                }
                else if (temp % 2 == 0){
                    System.out.print(c[1]);
                }
                else if (temp % 2 != 0){
                    System.out.print(c[0]);
                }
                System.out.print(" ");
                temp++;
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(1);
    }
}
