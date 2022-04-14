package nonReturnTypeMethods;

public class NonReturnTypeMethods1 {

    // 5 Parameterized Non-Return Type Methods.

    String songName;
    String singerName;
    int songRating;
    String songGenre;
    boolean lyricPrinter;

    void setSongName(String songName){
        this.songName=songName;
        System.out.println("\n\nSong name : \t"+songName);
    }
    void setSingerName(String singerName){
        this.singerName=singerName;
        System.out.println("Singer : \t\t"+singerName);
    }
    void setGenre(String songGenre){
        this.songGenre=songGenre;
        System.out.println("Song genre : \t"+songGenre);
    }
    void setSongRating(int songRating){
        this.songRating=songRating;
        System.out.println("\nI would rate the song "+songRating+" out of 10!\n");
    }
    void lyricPrinter(boolean print){
        this.lyricPrinter=print;
        if(print==true)
        System.out.println("Legendary Lyric of "+this.songName+":\n\nHa boom boom \nJab bhi milte hai hum tum \nAankho aankho me hote hae Gum \nDil bole boom boom\n" +
                "\nAa boom boom \nMere sine ki dhadkan ko sun \nMeri sanso ko teri hi dhun \nDil bole boom boom");
    }

    public static void main(String[] args) {
        NonReturnTypeMethods1 objc=new NonReturnTypeMethods1();

        objc.setSongName("Boom! Boom!");
        objc.setSingerName("Nazia Hassan");
        objc.setGenre("Pop");
        objc.setSongRating(8);
        objc.lyricPrinter(true);
    }

}
