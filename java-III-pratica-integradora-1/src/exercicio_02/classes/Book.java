package exercicio_02.classes;

public class Book extends Document {
    String title;
    String author;
    String genre;
    int numberOfPages;

    public Book(String title, String author, String genre, int numberOfPages) {
        super("Book");
        this.setTitle(title);
        this.setAuthor(author);
        this.setGenre(genre);
        this.setNumberOfPages(numberOfPages);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


    @Override
    public String toString() {
        return ("Title: " + this.getTitle() + "\n" +
                "Author: " + this.getAuthor() + "\n" +
                "Genre: " + this.getGenre() + "\n" +
                "Number of Pages: " + this.getNumberOfPages() + "\n");
    }
}
