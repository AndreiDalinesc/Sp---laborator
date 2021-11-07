package Proiect_SP;

    import java.util.ArrayList;
    import java.util.List;

public class SubChapter extends Element {
    private String name;
    private List<Paragraph> paragraphs = new ArrayList<>();
    private List<Image> images = new ArrayList<>();
    private List<Table> tables = new ArrayList<>();
    private Chapter chapter;

    public SubChapter(String name, Chapter chapter) {
        this.name = name;
        this.chapter = chapter;
    }

    public void print() {
        System.out.println( "Subchapter: " + name );
    }

    @Override
    public void add(Element el) {}

    @Override
    public void remove(Element el) {}

    @Override
    public Element get(int num) {
        return null;
    }

}