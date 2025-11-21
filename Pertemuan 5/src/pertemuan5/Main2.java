package pertemuan5;

public class Main2 {
    public static void main(String[] args) {
        Direktur d = new Direktur();

        System.out.println("Method dari class Direktur:");
        d.dataPegawai();        // dari Pegawai
        d.kelolaTim();          // dari Manajer
        d.membuatKeputusan();   // dari Direktur
    }
}
