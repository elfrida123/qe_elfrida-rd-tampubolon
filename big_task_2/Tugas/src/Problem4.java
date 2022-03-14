import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJLMNOPQRSTUVWXYZ";
        System.out.print("Masukkan huruf yang ingin dicari indeksnya: ");
        Scanner scan = new Scanner(System.in);
        char find = scan.next().charAt(0);
        int idx = 1;
        int idx5 = 1;
        if(find == 'K'){
            System.out.println("3 1");
            return ;
        }
        for(Character s : str.toCharArray()){
            if(find == s){
                System.out.println("" + idx + " " + idx5);
                return ;
            }
            if(idx == 5){
                idx5++;
                idx = 0;
            }
            idx++;
        }
    }
}
