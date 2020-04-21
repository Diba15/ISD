public class Pakaian implements Comparable<Pakaian> {
    private int tanggal;
    private int id;
    private String nama;
    private int berat;

    public Pakaian(int tanggal, int id, String nama, int berat) {
        this.tanggal = tanggal;
        this.id = id;
        this.nama = nama;
        this.berat = berat;
    }

    @Override
    public String toString() {
        return "WaktuSelesai = " + tanggal +
                ", id = " + id +
                ", nama = " + nama +
                ", berat = " + berat + "Kg";
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    @Override
    public int compareTo(Pakaian o) {
        return Integer.toString(this.tanggal).compareTo(Integer.toString(o.getTanggal()));
    }
}
