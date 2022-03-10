package SoalNo1;

public class BangunDatar {
    int luas(){
        System.out.println("Luas: ");
        return 0;
    }

    int keliling(){
        System.out.println("Keliling: ");
        return 0;
    }

    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        Persegi persegi = new Persegi();
        persegi.sisi = 4;

        Segitiga segitiga = new Segitiga();
        segitiga.a = 3;
        segitiga.b = 4;
        segitiga.c = 5;

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 7;
        persegiPanjang.lebar = 8;

        // method
        System.out.println("Luas");
        persegi.luas();
        segitiga.luas();
        persegiPanjang.luas();
        System.out.println("");

        System.out.println("Keliling");
        persegi.keliling();
        segitiga.keliling();
        persegiPanjang.keliling();
    }
}
