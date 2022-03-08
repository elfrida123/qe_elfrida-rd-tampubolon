package PartA;

import java.util.Scanner;

public class Problem5 {
    private static boolean primeNumber (int angka){
        if (angka <= 1){
            return false;
        }

        for (int i=2; i<Math.sqrt(angka); i++){
            if (angka % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(primeNumber(10));
        System.out.println(primeNumber(11)); //true
        System.out.println(primeNumber(13)); //true
        System.out.println(primeNumber(17)); //true
        System.out.println(primeNumber(20)); //false
        System.out.println(primeNumber(35)); //false
    }

}
