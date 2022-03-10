package SoalNo2;

public class BangunRuang {
    int volume(){
        System.out.println("Volume: ");
        return 0;
    }

    public static void main(String[] args) {
        BangunRuang bangunRuang = new BangunRuang();

        Kubus kubus = new Kubus();
        kubus.sisi = 10;

        Balok balok = new Balok();
        balok.panjang = 3;
        balok.lebar = 6;
        balok.tinggi = 10;

        Tabung tabung = new Tabung();
        tabung.phi = 22/7;
        tabung.jari = 7;
        tabung.tinggi = 10;

        // method
        System.out.println("Volume");
        kubus.volume();
        balok.volume();
        tabung.volume();
    }

}
