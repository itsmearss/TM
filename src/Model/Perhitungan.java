package Model;

import interfaces.ContohInterface;

public class Perhitungan implements ContohInterface {
    private int a;
    private int b;
    private int hasil;

    public Perhitungan (int a, int b, int _hasil){
        this.a = a;
        this.b = b;
        _hasil = 0;
        this.hasil = _hasil;
        PrintJudulClass("Print Judul Dalam Method Perhitungan");
    }

    public void PrintJudulClass(String jdl){
        System.out.println("Judul Menggunakan Interface");
    }


    @Override
    public String PrintJudul(String Judul) {
        return Judul;
    }

    @Override
    public int HitungTambah(int a, int b) {
        return a + b;
    }

    @Override
    public int HitungKali(int a, int b) {
        return a * b;
    }
}
