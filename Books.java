import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Books implements Comparable<Book>
{
    ArrayList<Book> books;

    public Books()
    {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book)
    {
        books.add(book);
    }

    public void booksPrint()
    {
        for(int i = 0; i < books.size(); i++)
        {
            System.out.println(books.get(i).toString());
            System.out.println("---------------------");
        }
    }

    public void changePrice(int percent)
    {
        for(int i = 0; i < books.size(); i++)
        {
            books.get(i).setPrice(books.get(i).getPrice() * (1 + (percent / (double)100)));
        }
    }

    public void getAuthorsBooks(String author)
    {
        for(int i = 0; i < books.size(); i++)
        {
            if (books.get(i).getAuthor() == author)
            {
                System.out.println(books.get(i).toString());
                System.out.println("---------------------");
            }
        }
    }

    public void getBooksAfterPublYear(int year)
    {
        for(int i = 0; i < books.size(); i++)
        {
            if(books.get(i).getPublishmentYear() > year)
            {
                System.out.println(books.get(i).toString());
                System.out.println("---------------------=====");
            }
        }
    }

    @Override
    public int compareTo(Book o)
    {
        return toString().compareTo(o.toString());
    }

    public void sortAutorsBooks()
    {
        ArrayList<Book> authorBooks = new ArrayList<Book>();
        for(int i = 0; i < books.size(); i++)
        {
            authorBooks.add(books.get(i));
        }
        Collections.sort(authorBooks, new Comparator<Book>()
        {
            @Override
            public int compare(Book book1, Book book2)
            {
                return book1.getName().compareTo(book2.getName());
            }
        });
        for(int i = 0; i < authorBooks.size(); i++)
        {
            System.out.println(authorBooks.get(i).toString());
            System.out.println("---------------------");
        }
    }

    public void sortByPublishment()
    {
        ArrayList<Book> publishmentBooks = new ArrayList<Book>();
        for(int i = 0; i < books.size(); i++)
        {
            publishmentBooks.add(books.get(i));
        }
        Collections.sort(publishmentBooks, new Comparator<Book>()
        {
            @Override
            public int compare(Book book1, Book book2)
            {
                return book1.getPublishment().compareTo(book2.getPublishment());
            }
        });
        for(int i = 0; i < publishmentBooks.size(); i++)
        {
            System.out.println(publishmentBooks.get(i).toString());
            System.out.println("---------------------");
        }
    }

    public void sortByPrice()
    {
        ArrayList<Book> priceBooks = new ArrayList<Book>();
        for(int i = 0; i < books.size(); i++)
        {
            priceBooks.add(books.get(i));
        }
        Collections.sort(priceBooks, new Comparator<Book>()
        {
            @Override
            public int compare(Book book1, Book book2)
            {
                if(book1.getPrice() > book2.getPrice()) return -1;
                else if(book2.getPrice() > book1.getPrice()) return 1;
                return 0;
            }
        });
        for(int i = 0; i < priceBooks.size(); i++)
        {
            System.out.println(priceBooks.get(i).toString());
            System.out.println("---------------------");
        }
    }
}
