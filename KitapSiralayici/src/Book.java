public class Book{
    private String name;
    private int pageNumber;
    private int date;

    public Book(String name, int pageNumber, int date) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setDate(int date) {
        this.date = date;
    }

}
