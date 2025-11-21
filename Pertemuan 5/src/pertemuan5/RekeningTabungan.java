package pertemuan5;

class RekeningTabungan extends AkunBank {
    private double bunga = 0.02;

    public RekeningTabungan(double saldo, String pemilik, String noRekening) {
        super(saldo, pemilik, noRekening);
    }

    public void infoRekening() {
        // saldo tidak bisa diakses langsung → private
        System.out.println("Saldo      : " + getSaldo()); 
        // pemilik bisa diakses karena protected
        System.out.println("Pemilik    : " + pemilik);
        // no rekening bisa diakses karena public
        System.out.println("No Rekening: " + noRekening);
    }
}
