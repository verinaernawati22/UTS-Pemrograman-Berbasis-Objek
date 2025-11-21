package pertemuan5;

public class Main3 {
    public static void main(String[] args) {
        RekeningTabungan rt = new RekeningTabungan(500000, "Verina", "1234567890");

        System.out.println("Informasi Rekening Tabungan:");
        rt.infoRekening();
    }
}
