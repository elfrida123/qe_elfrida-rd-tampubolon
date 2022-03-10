package SoalNo4;

import java.text.DecimalFormat;

public class Barang {
    static void dimensi(double panjang, double lebar, double tinggi, double berat){
        double dimensi_barang = panjang * lebar * tinggi;
        double minDimensi = 50d;
        double minBerat =  1d;
        int harga = 5000;
        double totalDimensi = Math.ceil(dimensi_barang / minDimensi);
        double totalBerat = Math.ceil(berat / minBerat);
        double totalHarga = Math.max(totalDimensi, totalBerat) * harga;
        DecimalFormat df = new DecimalFormat("#");
        System.out.println("Harga : Rp" + df.format(totalHarga));
    }

    public static void main(String[] args) {
        dimensi(5, 2, 4, 1);
    }
}
