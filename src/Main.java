



public class Main {
    public static void main(String[] args)
    {
        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");

        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);

        scOneOne.creatNewParagraph("Paragraphe 1");
        scOneOne.creatNewParagraph("Paragraphe 2");
        scOneOne.creatNewParagraph("Paragraphe 3");
        scOneOne.createNewImage("Image 1");
        scOneOne.creatNewParagraph("Paragraphe 4");
        scOneOne.createNewImage("Image 1");
        scOneOne.creatNewParagraph("Paragraphe 5");

        scOneOne.print()
    }
}
