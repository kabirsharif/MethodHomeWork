package returnTypeMethods;

public class ReturnTypeMethods1 {

    // 5 Parameterized Return Type Methods.

    String songName;
    String singerName;
    int songRating;
    String songGenre;
    boolean lyricPrinter;

    public String setSongName(String songName){
        this.songName=songName;
        return this.songName;
    }
    public String setSingerName(String singerName){
        this.singerName=singerName;
        return this.singerName;
    }
    public String setGenre(String songGenre){
        this.songGenre=songGenre;
        return this.songGenre;
    }
    public int setSongRating(int songRating){
        this.songRating=songRating;
        return this.songRating;
    }
    public boolean lyricPrinter(boolean print){
        this.lyricPrinter=print;
        return this.lyricPrinter;
    }

    public static void main(String[] args) {
        ReturnTypeMethods1 objc=new ReturnTypeMethods1();

        System.out.println("\n\nSong name : \t"+objc.setSongName("Boom! Boom!"));
        System.out.println("Singer : \t\t"+objc.setSingerName("Nazia Hassan"));
        System.out.println("Song genre : \t"+objc.setGenre("Pop"));
        System.out.println("\nI would rate the song "+objc.setSongRating(8)+" out of 10!\n");
        objc.lyricPrinter(true);
        if(objc.lyricPrinter==true) {
            System.out.println("Legendary Lyric of " + objc.songName + ":\n\nHa boom boom \nJab bhi milte hai hum tum \nAankho aankho me hote hae Gum \nDil bole boom boom\n" +
                    "\nAa boom boom \nMere sine ki dhadkan ko sun \nMeri sanso ko teri hi dhun \nDil bole boom boom");
        }
    }
}
