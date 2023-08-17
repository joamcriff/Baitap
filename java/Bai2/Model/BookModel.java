package Bai2.Model;

public class BookModel extends DocumentModel {
    private int numPage;
    private String author;
    public BookModel(String id, String publish, int count, int numPage, String author) {
        super(id, publish, count);
        this.numPage = numPage;
        this.author = author;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Id='" + getId() + '\'' +
                ", Imprint='" + getPublish() + '\'' +
                ", Release number=" + getCount() +
                ", Number Page='" + getNumPage() + '\'' +
                ", Author='" + getAuthor() + '\'' +
                '}';
    }
}
