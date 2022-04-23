import Model.Perhitungan;

public class JalankanPerhitungan {
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4, 6, 0);

        String judul;
        judul = s.PrintJudul("Judul Menggunakan Interface");
        System.out.println(judul);
        System.out.println(s.PrintJudul("Judul Menggunakan Interface"));
        System.out.println();

        int hasiltambah;
        hasiltambah = s.HitungTambah(4,6);
        System.out.println(hasiltambah);
        System.out.println(s.HitungTambah(4, 6));
        System.out.println();

        int hasilkali;
        hasilkali = s.HitungKali(4,6);
        System.out.println(hasilkali);
        System.out.println(s.HitungKali(4,6));
    }
    //Munculkan Hasilnya Dengan Return Value dikumpulkan hari sabtu di github
    //TM_21090096_Annur Riyadhus Solikhin_2D
    //

}
