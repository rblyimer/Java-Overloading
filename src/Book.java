public class Book {
    private String title;
    private int numOfPages;
    private int Year;

    public Book(String title, int numOfPages, int Year) {
        this.title = title;
        this.numOfPages = numOfPages;
        this.Year = Year;
    }

    public String getTitle() {
        return title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public int getYear() {
        return Year;
    }

    @Override
    public String toString() {
        return getTitle() + ", " + getNumOfPages() + " pages, " + getYear();
    }

}