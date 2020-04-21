package com.company;
public class Main {
    public static void main(String[] args) {
        Graph graf = new Graph(6);     //Ukuran Graph 6 karena mengikuti soal yaitu A,B,C,D,E,F
        graf.tambahEdge(0,1);    //0 is A, 1 is B
        graf.tambahEdge(0, 2);    //2 is C
        graf.tambahEdge(0, 3);    //3 is D
        graf.tambahEdge(1, 2);
        graf.tambahEdge(1, 4);    //4 is E
        graf.tambahEdge(3, 4);
        graf.tambahEdge(3, 5);    //5 is F
        graf.Tampilkan();
    }
}
