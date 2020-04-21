package com.company;
import java.util.*;
public class Graph {
    int vertex;
    LinkedList[] list;
    char huruf;

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i <vertex ; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void tambahEdge(int asal, int tujuan){

        list[asal].addFirst(tujuan);

        list[tujuan].addFirst(asal);
    }

    public void Tampilkan(){
        for (int i = 0; i <vertex ; i++) {
            if(list[i].size()>0) {
                switch (i) {
                    case 0:
                        huruf = 'A';
                        break;
                    case 1:
                        huruf = 'B';
                        break;
                    case 2:
                        huruf = 'C';
                        break;
                    case 3:
                        huruf = 'D';
                        break;
                    case 4:
                        huruf = 'E';
                        break;
                    case 5:
                        huruf = 'F';
                        break;
                }
                System.out.print(huruf + " Terhubung dengan");
                for (int j = 0; j < list[i].size(); j++) {
                    int h = (int) list[i].get(j);
                    switch (h) {
                        case 0:
                            huruf = 'A';
                            break;
                        case 1:
                            huruf = 'B';
                            break;
                        case 2:
                            huruf = 'C';
                            break;
                        case 3:
                            huruf = 'D';
                            break;
                        case 4:
                            huruf = 'E';
                            break;
                        case 5:
                            huruf = 'F';
                            break;
                    }
                    System.out.print(" -> ");
                    System.out.print(huruf);
                }
                System.out.print("|/");
                System.out.println();
            }
        }
    }
}
