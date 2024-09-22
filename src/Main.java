public class Main {
    public static void main(String[] args) {
        book bookOfBill = new book();
        bookOfBill.title = "The Book of Bill";
        bookOfBill.author = "Alex Hirsch";
        bookOfBill.price = 27;
        bookOfBill.year = 2024;

        book book2 = new book();
        book2.title = "Java for Noobs";

        book book3 = new book("War and Peace", "Lev Tolstoy", 5, 1867);

        bookOfBill.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
