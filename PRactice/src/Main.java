import javax.swing.JOptionPane;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        String[] Books = {"Mein Kampf", "48 Laws of Power", "Superman"}; //your listed books
        while(true)
        {
            String[] Options = {"View all books", "Add a book", "Borrow a book", "Exit"};//Your options

            int Menyo = JOptionPane.showOptionDialog(null, "Welcome to Library Menu! What would you like to do?", "Library Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Options, Options[0]);//Dialog box to display options
            if (Menyo == 0) //this is "view all books"
            {
                String message = String.join("\n", Books);//function of String.join is only when you have an existing array and display that array in a single string
                JOptionPane.showMessageDialog(null, message, "Available Books", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (Menyo == 1)
            {
                String newBook = JOptionPane.showInputDialog(null, "Please add a book: ");
                if (newBook != null && !newBook.trim().isEmpty())// translation of this condition: if newBook is not equal to null and not " " or ""
                {
                    Books = Arrays.copyOf(Books, Books.length + 1);
                    Books[Books.length - 1] = newBook;
                    //Explanation of this 2 lines above: Since we know that "Books" is an array, We put the Arrays.copyOf. To use Arrays.copyOf(ExampleArray, Example.length + #). First word inside the parenthesis is your Array, second is the length of your array plus how many spaces you want to add.
                    //So in result the compiler will read it as "Mein Kampf", "48 Laws of Power", "Superman", null. Now to replace the null we need Books[Books.length - 1] = newBook. This replaces the null with the added book.
                    JOptionPane.showMessageDialog(null, "Book added successfully!", "Available Books", JOptionPane.INFORMATION_MESSAGE);
                    String updated = String.join("\n", Books);
                    JOptionPane.showMessageDialog(null, updated, "Book added successfully!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else if (Menyo == 2)
            {
                int borrowbook = JOptionPane.showOptionDialog(null, "Select a book you want to borrow: ", "Book borrow", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Books, Books[0]);
                if (borrowbook != JOptionPane.CLOSED_OPTION) //translation of this condition: if borrowedbook is not equals to closed
                {
                    if (Books[borrowbook].endsWith("(Borrowed)"))
                    {
                        JOptionPane.showMessageDialog(null, "This book is borrowed!");
                    }
                    else
                    {
                        String BorrowBook = Books[borrowbook];//the book you chose
                        Books[borrowbook] = Books[borrowbook] + (" (Borrowed)");//adds (Borrowed) to the chosen book
                        JOptionPane.showMessageDialog(null, "You borrowed: " + BorrowBook, "Available Books", JOptionPane.INFORMATION_MESSAGE);
                    }
                    String updatedBooks = "Updated Catalog:\n" + String.join("\n", Books);
                    JOptionPane.showMessageDialog(null, updatedBooks, "Updated Books", JOptionPane.INFORMATION_MESSAGE);

                }
            }
            else
            {
                System.exit(0);
            }
        }
    }
}