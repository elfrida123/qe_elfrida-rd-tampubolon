package Problem3;

import java.util.ArrayList;
import java.util.List;

public class Mobil {
    int kapasistas;
    List<Hewan> muatan;

    public Mobil(int kapasistas, List<Hewan> muatan) {
        this.kapasistas = kapasistas;
        this.muatan = muatan;
    }

    public boolean tambahMuatan(Hewan hewan) {
        int sumMuatan = muatan.stream().mapToInt(Hewan::getWeight).sum() + hewan.weight;
        if (sumMuatan <= kapasistas) {
            muatan.add(hewan);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Hewan hewan = new Hewan(50);
        Mobil mobil = new Mobil(100, new ArrayList<Hewan>() {
            {
                add(new Hewan(20));
                add(new Hewan(20));
            }
        });
        if (mobil.tambahMuatan(hewan) == true) {
            System.out.println("Berhasil ditambahkan");
        } else {
            System.out.println("Gagal Ditambahkan");
        }

    }
}
