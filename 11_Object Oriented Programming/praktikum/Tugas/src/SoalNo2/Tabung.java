package SoalNo2;

public class Tabung{
    int phi, jari, tinggi;

    int volume(){
        int volume = ((22*jari*jari*tinggi)/7);
        System.out.println("Tabung : " + volume);
        return volume;
    }
}
