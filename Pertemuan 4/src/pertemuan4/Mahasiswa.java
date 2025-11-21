package pertemuan4;

class Mahasiswa {
    private String nama;
    private String nim;

    // 1. Default Constructor
    public Mahasiswa() {
        this.nama = "Faishal";
        this.nim = "3260240003";
    }

    // 2. Parameterized Constructor
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // 3. Copy Constructor
    public Mahasiswa(Mahasiswa m) {
        this.nama = m.nama;
        this.nim = m.nim;
    }

    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
    }
}
