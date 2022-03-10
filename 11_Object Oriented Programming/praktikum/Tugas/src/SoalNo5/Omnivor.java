package SoalNo5;

public class Omnivor extends Animal{
    @Override
    public void identify_myself(){
        System.out.print("Hi I'm Omnivore, My Name is " + nama);
        System.out.print(", My Food is " + jenis_makanan);
        System.out.print(", I have " + gigi + " teeth");
    }
}
