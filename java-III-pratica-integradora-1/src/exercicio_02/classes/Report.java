package exercicio_02.classes;

public class Report extends Document {
    String text;
    int numberOfPages;
    String author;
    String reviewer;

    public Report(String text, int numberOfPages, String author, String reviewer) {
        super("Report");
        this.setText(text);
        this.setNumberOfPages(numberOfPages);
        this.setAuthor(author);
        this.setReviewer(reviewer);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
}
