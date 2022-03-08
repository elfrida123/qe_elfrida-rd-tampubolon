package PartA;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        int bilangan;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang ingin dicari faktornya : ");
        bilangan = input.nextInt();
        System.out.println("Faktor dari " + bilangan + " adalah : ");
        for (int i=1; i<=bilangan; i++){
            if (bilangan%i == 0){
                System.out.println(i + " ");
            }
        }
    }
}
