package pertemuan5;

class AkunBank {
    private double saldo;          // TIDAK bisa diakses langsung oleh subclass
    protected String pemilik;      // BISA diakses oleh subclass
    public String noRekening;      // bebas diakses

    public AkunBank(double saldo, String pemilik, String noRekening) {
        this.saldo = saldo;
        this.pemilik = pemilik;
        this.noRekening = noRekening;
    }

    // akses saldo lewat method public
    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
    }
}
