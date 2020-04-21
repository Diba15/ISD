public class MusicItem {
    private String song;
    private String singer;
    private int duration;

    public MusicItem(String song, String singer, int duration) {
        this.song = song;
        this.singer = singer;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "MusicItem{" +
                "song='" + song + '\'' +
                ", singer='" + singer + '\'' +
                ", duration=" + duration +
                '}';
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
