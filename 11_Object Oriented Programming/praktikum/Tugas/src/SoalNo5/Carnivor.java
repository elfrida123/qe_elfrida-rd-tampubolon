package SoalNo5;

public class Carnivor extends Animal{
    @Override
    public void identify_myself(){
        System.out.print("Hi I'm Carnivore, My Name is " + nama);
        System.out.print(", My Food is " + jenis_makanan);
        System.out.print(", I have " + gigi + " teeth");
        System.out.println("");
        System.out.println("");
    }
}
