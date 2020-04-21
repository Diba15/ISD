import java.util.LinkedList;
import java.util.Queue;

public class AntrianRoti{
    private Queue<BreadItem> antrian;
    private int count;

    public AntrianRoti(){

        antrian  = new LinkedList<>();  //(1)
    }

    public void ambilNomor(int no, String nama, String jenis, int jumlah){
        BreadItem item = new BreadItem(no, nama, jenis, jumlah);
        antrian.add(item); //(2)
        if(!antrian.isEmpty())           //(3)
            System.out.println("Anda menunggu "+ count+" orang lagi");

        count++;       //(4)
    }

    public BreadItem panggilan(){
        count--;
        BreadItem breadItem = antrian.remove(); //(5)
        return breadItem;
    }

    public void panggilanRoti(){
        BreadItem bread = panggilan();

        System.out.println("Nomor " + bread.getNo() /*(6)*/ + "\nuntuk pembelian "+ bread.getNama()+" sudah siap");
    }

    public void hapusAntrian(){

        antrian.remove(); //(7)
    }
}
