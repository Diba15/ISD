import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MusicPlayer {
    LinkedList<MusicItem> list = new LinkedList<>();

    public MusicPlayer(String nama){
        System.out.println("Music Player: "+nama + " dibuat");
    }

    public void addSong (String song, String singer, int duration){
        list.add(new MusicItem(song, singer, duration));   //(1)
    }

    public void deleteSong(String song){
        //(2)
        for (MusicItem songDeleted : list) {
            if (songDeleted.getSong().equals(song))
                list.remove(songDeleted); //(3)
        }
    }

    public MusicItem deleteDepan(){
        MusicItem removedSong = list.pollFirst(); //(4)
        return removedSong;
    }

    public void playMusic(){
        ListIterator<MusicItem> iterator = (ListIterator<MusicItem>) list.iterator(); //(5)

        int i = 1;
        while (iterator.hasNext()){                   //(6)
            System.out.println("Memainkan lagu ke- " + i);
            System.out.println(iterator.next());
            i++;
        }
    }

    public void playMusicBackward(){
        Iterator<MusicItem> iterator = list.iterator();   //(7)

        int i = 1;
        while (iterator.hasNext()){                         //(8)
            System.out.println("Memainkan lagu ke- " + i);
            System.out.println(iterator.next());
            list.poll();                        //(9)
        }
    }
}
