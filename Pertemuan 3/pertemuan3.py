class Mahasiswa:
    def __init__(self, nama, nim):
        self._nama = nama
        self.nim = nim  # gunakan setter validasi

    # Getter nama
    @property
    def nama(self):
        return self._nama

    # Setter nama
    @nama.setter
    def nama(self, value):
        self._nama = value

    # Getter NIM
    @property
    def nim(self):
        return self._nim

    # Setter NIM dengan validasi (10 digit)
    @nim.setter
    def nim(self, value):
        if isinstance(value, str) and value.isdigit() and len(value) == 10:
            self._nim = value
        else:
            raise ValueError("NIM harus 10 digit angka!")

    # Method tampil data
    def print_info(self):
        print("Nama:", self._nama)
        print("NIM :", self._nim)


# Contoh penggunaan
m1 = Mahasiswa("Verina", "32602400117")
m1.print_info()

# m1.nim = "1234"   # contoh error