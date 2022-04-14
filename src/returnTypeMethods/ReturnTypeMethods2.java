package returnTypeMethods;

public class ReturnTypeMethods2 {

    // 5 Non-Parameterized Return Type Methods.

    String songName;
    String singerName;
    int songRating;
    String songGenre;
    boolean lyricPrinter;

    public String setSongName(){
        songName="Remember the name";
        return songName;
    }
    public String setSingerName(){
        singerName="Fort Minor";
        return singerName;
    }
    public String setGenre(){
        songGenre="Rap with flavor of Hip Hop";
        return songGenre;
    }
    public int setSongRating(){
        songRating=9;
        return songRating;
    }
    public boolean lyricPrinter(){
        lyricPrinter=true;
        return lyricPrinter;
    }

    public static void main(String[] args) {
        ReturnTypeMethods2 objc=new ReturnTypeMethods2();

        System.out.println("\n\nSong name : \t"+objc.setSongName());
        System.out.println("Singer : \t\t"+objc.setSingerName());
        System.out.println("Song genre : \t"+objc.setGenre());
        System.out.println("\nI would rate the song "+objc.setSongRating()+" out of 10!\n");
        objc.lyricPrinter();
        if(objc.lyricPrinter==true) {
            System.out.println("The absolute nuclear bomb of a lyric of " + objc.songName + ":\n\nThis is ten percent luck \nTwenty percent skill \nFifteen percent concentrated power of will \nFive percent pleasure" +
                    "\nFifty percent pain \nAnd a hundred percent reason to remember the name");
        }
    }
}
