package pertemuan3;

public class Mahasiswa {
    private String nama;
    private String nim;

    // Constructor
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        setNim(nim); // gunakan setter agar tetap tervalidasi
    }

    // Getter Nama
    public String getNama() {
        return nama;
    }

    // Setter Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter NIM
    public String getNim() {
        return nim;
    }

    // Setter NIM dengan validasi (harus 10 digit)
    public void setNim(String nim) {
        if (nim != null && nim.matches("\\d{10}")) {
            this.nim = nim;
        } else {
            throw new IllegalArgumentException("NIM harus 10 digit angka!");
        }
    }

    // Method untuk menampilkan info
    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
    }

    // Contoh penggunaan
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Verina", "326024017");
        m1.printInfo();

        // m1.setNim("12345");  // contoh error
    }
}
