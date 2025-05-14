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
        return The book title is +title+ " written by " + author + " and costs " + price;
    }
}