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
        Book book = new Book();
        book.settitle("Mt15");
        book.setauthor("Saran");
        book.setprice(2.15f);

        System.out.println(book.toString());
    }
}