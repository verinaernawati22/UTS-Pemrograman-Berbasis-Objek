package pertemuan4;

public class Main {
    public static void main(String[] args) {

        // Objek 1 → default constructor
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Objek m1 (default):");
        m1.printInfo();
        System.out.println();

        // Objek 2 → parameterized constructor
        Mahasiswa m2 = new Mahasiswa("Verina", "3260240117");
        System.out.println("Objek m2 (parameterized):");
        m2.printInfo();
        System.out.println();

        // Objek 3 → copy constructor
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("Objek m3 (copy dari m2):");
        m3.printInfo();
    }
}
