package SoalNo1;

public class Segitiga {
    int a, b, c;

    int luas(){
        int luas = a * b / 2;
        System.out.println("Segitiga : " + luas);
        return luas;
    }

    int keliling(){
        int keliling = a + b + c;
        System.out.println("Segitiga : " + keliling);
        return keliling;
    }
}
