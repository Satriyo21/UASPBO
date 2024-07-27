public class Main {
    public static void main(String[] args) {
        Pengguna pengguna = new Pengguna();
        Buku buku = new Buku();
        Komik komik = new Komik();
        Novel novel = new Novel();

        // Contoh penggunaan metode pada objek Cerpen
        novel.setJudul("Novel Romance");
        novel.setPenulis("Penulis ");
        novel.setJumlahHalaman(300);
        novel.setHarga(50000);

        novel.tampilkanDetailNovel();
        novel.tambahDiskon(5000);
        novel.naikkanHarga();

        // Menggunakan getter untuk mendapatkan nilai atribut
        System.out.println("Judul Novel: " + novel.getJudul());
        System.out.println("Penulis Novel: " + novel.getPenulis());
        System.out.println("Jumlah Halaman Novel: " + novel.getJumlahHalaman());
        System.out.println("Harga Novel: " + novel.getHarga());
    }
}