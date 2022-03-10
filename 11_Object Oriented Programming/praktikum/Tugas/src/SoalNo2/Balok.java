package SoalNo2;

public class Balok{
    int panjang, lebar, tinggi;

    int volume(){
        int volume = panjang * lebar * tinggi;
        System.out.println("Balok : " + volume);
        return volume;
    }
}
