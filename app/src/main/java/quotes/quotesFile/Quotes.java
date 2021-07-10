package quotes.quotesFile;

public class Quotes {
    private String text;
    private String author;

    public Quotes(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "text='" + text + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}