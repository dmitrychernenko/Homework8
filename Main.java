import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Book book = new Book("12ksx1245", "Xamerican Gods", "Neil Geiman", "BBC", 2005, 654, 15);
            Book book1 = new Book("12dvs1314", "Ctuluhu Cult", "Neil Geiman", "BBC", 2016, 640, 9.5);
            Book book2 = new Book("13ads2114", "Shantarm", "Gregory Roberts", "Azbuka", 2012, 1088, 17.5);
            Books books = new Books();
            books.addBook(book);
            books.addBook(book1);
            books.addBook(book2);

            books.booksPrint();

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter percent to change books price: ");
            books.changePrice(scan.nextInt());

            /*System.out.print("Enter author to find his/her books: ");
            scan.nextLine();
            String author = scan.nextLine();
            !!!Особенности сканнера джавы, почему-то не работает, если передавать автора через сканнер.
            !!!Но если передавать просто стрингом в параметры функции - всё ок
            books.getAuthorsBooks(author); - не сработает!*/
            books.getAuthorsBooks("Neil Geiman");

            System.out.print("Enter publishment year to find books: ");
            books.getBooksAfterPublYear(scan.nextInt());

            System.out.println("Now sorting books by author's name:");
            books.sortAutorsBooks();
            System.out.println("Now sorting books by publishment's name:");
            books.sortByPublishment();
            System.out.println("Now sorting books by book's price:");
            books.sortByPrice();
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }


    }
}
