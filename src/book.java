public class book {
    public String title;
    public String author;
    public int price;
    public int year;

    public book() {
        this.title = "No Title";
        this.author = "No Author";
        this.price = 0;
        this.year = 0;
    }

    public book(String title, String author, int price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    public void displayInfo()
    {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price + "$");
        System.out.println("Book Year: " + year);
        System.out.println();
    }
}
