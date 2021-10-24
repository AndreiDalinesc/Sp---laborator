package Proiect_SP;

public class Image {
    private String imageName;
    private SubChapter subChapter;
    private Paragraph paragraph;

    public Image(String name, SubChapter sc) {
        this.imageName = name;
        this.subChapter = sc;
    }

    public void print() {
        System.out.println( "Proiect_SP.Image with name: " + imageName );
    }

}
