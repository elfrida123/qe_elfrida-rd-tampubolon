package SoalNo1;

public class PersegiPanjang {
    int panjang, lebar;

    int luas(){
        int luas = panjang * lebar;
        System.out.println("Persegi Panjang : " + luas);
        return luas;
    }

    int keliling(){
        int keliling = 2*(panjang + lebar);
        System.out.println("Persegi Panjang : " + keliling);
        return keliling;
    }
}
