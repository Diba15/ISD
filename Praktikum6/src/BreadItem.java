public class BreadItem {
    private int no;
    private String nama;
    private String jenis;
    private int jumlah;

    public BreadItem(int no, String nama, String jenis, int jumlah) {
        this.no = no;
        this.nama = nama;
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "BreadItem{" +
                "no=" + no +
                ", nama='" + nama + '\'' +
                ", jenis='" + jenis + '\'' +
                ", jumlah='" + jumlah + '\'' +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}
