package SoalNo1;

public class Persegi {
    int sisi;

    int luas(){
        int luas = sisi * sisi;
        System.out.println("Persegi : " + luas);
        return luas;
    }

    int keliling(){
        int keliling = 4 * sisi;
        System.out.println("Persegi : " + keliling);
        return keliling;
    }
}
