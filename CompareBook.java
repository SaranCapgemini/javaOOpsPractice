public class CompareBook {
    public void compareBooks(Book book1, Book book2) {
        if (book1.getprice() > book2.getprice()) {
            System.out.println(book1.gettitle() + " is more expensive than " + book2.gettitle());
        } else if (book1.getprice() < book2.getprice()) {
            System.out.println(book1.gettitle() + " is cheaper than " + book2.gettitle());
        } else {
            System.out.println(book1.gettitle() + " and " + book2.gettitle() + " have the same price.");
        }
    }
}
