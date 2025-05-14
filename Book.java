public class Book{
    private String title;
    private String author;
    private float price;

    public void settitle(String title){
        this.title = title;
    }

    public void setauthor(String author){
        this.author = author;
    }

    public void setprice(float price){
        this.price = price;
    }

    public String gettitle(){
        return title;
    }

    public String getauthor(){
        return author;
    }

    public float getprice(){
        return price;
    }

    public String toString(){
        return "The book title is " +title+ " written by " + author + " and costs " + price;
    }

    public static void main(String args[]){
        Book book1 = new Book();
        book1.settitle("Mt15");
        book1.setauthor("Saran");
        book1.setprice(2.15f);

        System.out.println(book1.toString());

        Book book2 = new Book();
        book2.settitle("Mt16");
        book2.setauthor("Saran");
        book2.setprice(2.15f);

        System.out.println(book2);

        CompareBook compareBook = new CompareBook();
        compareBook.compareBooks(book1, book2);
    }
}