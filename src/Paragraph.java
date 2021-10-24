package Proiect_SP;

public class Paragraph {
    private String text;
    private SubChapter subChapter;

    public Paragraph(String text, SubChapter sc) {
        this.text = text;
        this.subChapter = sc;
    }

    public void print() {
        System.out.println( "Proiect_SP.Paragraph: " + text );
    }

}
