package nonReturnTypeMethods;

public class NonReturnTypeMethods2 {

    // 5 Non-Parameterized Non-Return Type Methods.

    String songName;
    String singerName;
    int songRating;
    String songGenre;
    String lyricPrinter;

    void setSongName(){
        songName="Remember the name";
        System.out.println("\n\nSong name : \t"+songName);
    }
    void setSingerName(){
        singerName="Fort Minor";
        System.out.println("Singer : \t\t"+singerName);
    }
    void setGenre(){
        songGenre="Rap with flavor of Hip Hop";
        System.out.println("Song genre : \t"+songGenre);
    }
    void setSongRating(){
        songRating=9;
        System.out.println("\nI would rate the song "+songRating+" out of 10!\n");
    }
    void lyricPrinter(){
        lyricPrinter="The absolute nuclear bomb of a lyric of Remember the Name:\n\nThis is ten percent luck \nTwenty percent skill \nFifteen percent concentrated power of will \nFive percent pleasure" +
                "\nFifty percent pain \nAnd a hundred percent reason to remember the name";
        System.out.println(lyricPrinter);
    }

    public static void main(String[] args) {
        NonReturnTypeMethods2 objc=new NonReturnTypeMethods2();

        objc.setSongName();
        objc.setSingerName();
        objc.setGenre();
        objc.setSongRating();
        objc.lyricPrinter();
    }
}
