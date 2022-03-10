package SoalNo3;

public class Calculator {
    int penjumlahan(){
        System.out.println("Penjumlahan");
        return 0;
    }

    int pengurangan(){
        System.out.println("Pengurangan");
        return 0;
    }

    int perkalian(){
        System.out.println("Perkalian");
        return 0;
    }

    int pembagian(){
        System.out.println("Pembagian");
        return 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Penjumlahan penjumlahan = new Penjumlahan();
        penjumlahan.a = 3;
        penjumlahan.b = 4;

        Pengurangan pengurangan = new Pengurangan();
        pengurangan.c = 15;
        pengurangan.d = 4;

        Perkalian perkalian = new Perkalian();
        perkalian.e = 10;
        perkalian.f = 10;

        Pembagian pembagian = new Pembagian();
        pembagian.i = 12;
        pembagian.j = 3;

        // method
        penjumlahan.penjumlahan();
        pengurangan.pengurangan();
        perkalian.perkalian();
        pembagian.pembagian();
    }
}
