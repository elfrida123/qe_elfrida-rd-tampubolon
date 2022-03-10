package SoalNo5;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.identify_myself();

        Herbivor herbivor = new Herbivor();
        herbivor.nama="Kambing";
        herbivor.jenis_makanan="tumbuhan";
        herbivor.gigi="tumpul";
        herbivor.identify_myself();


        Carnivor carnivor = new Carnivor();
        carnivor.nama="Singa";
        carnivor.jenis_makanan="daging";
        carnivor.gigi="tajam";
        carnivor.identify_myself();

        Omnivor omnivor = new Omnivor();
        omnivor.nama="Ayam";
        omnivor.jenis_makanan="semua";
        omnivor.gigi="tajam dan tumpul";
        omnivor.identify_myself();

    }
}
