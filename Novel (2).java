public class Novel {

    private int id;
    private String judul;
    private String penulis;
    private int jumlahHalaman;
    private double harga;

    // Constructor
    public Novel() {
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

    // Methods
    public void naikkanHarga() {
        System.out.println("Harga naik ");
    }

    public void tampilkanDetailNovel() {
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("Jumlah Halaman: " + this.jumlahHalaman);
        System.out.println("Harga: " + this.harga);
    }

    public void tambahDiskon(double diskon) {
        double hargaDiskon = this.harga - diskon;
        System.out.println("Harga setelah diskon: " + hargaDiskon);
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
