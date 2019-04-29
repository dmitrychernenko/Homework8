public class Book
{
    private String id;
    private String name;
    private String author;
    private String publishment;
    private int publishmentYear;
    private int sheetsCount;
    private double price;

    //методы доступа к полям
    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getPublishment()
    {
        return publishment;
    }

    public int getPublishmentYear()
    {
        return publishmentYear;
    }

    public int getSheetsCount()
    {
        return sheetsCount;
    }

    public double getPrice()
    {
        return this.price;
    }

    public double setPrice(double newPrice)
    {
        return this.price = newPrice;
    }

    public Book(String id, String name, String author, String publishment, int publishmentYear, int sheetsCount, double price)
    {
        this.id = id;
        if(Validator.IdValidation(id) == false) throw new IllegalArgumentException("Incorrect book ID format!");
        this.name = name;
        this.author = author;
        this.publishment = publishment;
        this.publishmentYear = publishmentYear;
        this.sheetsCount = sheetsCount;
        this.price = price;
    }

    public String toString()
    {
        return ("Book with ID: " + this.id + "\nName: " + this.name + "\nAuthor: " + this.author +
                "\nPublishment: " + this.publishment + "\nPublishment year: " + this.publishmentYear +
                "\nSheets: " + this.sheetsCount + "\nPrice: " + this.price + "$");
    }
}
