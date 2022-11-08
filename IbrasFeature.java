/**
 * This branch will contain code necessary for Ibraheem Elmasri of Group 7's feature which is book details
 */

/**
 * The following is a list of requirements listed for the book details feature:
 *
 * An administrator must be able to create a book with the book ISBN, book name, book description, price, author,
 * genre, publisher , year published and copies sold.
 *
 * Must be able retrieve a book’s details by the ISBN
 *
 * An administrator must be able to create an author with first name, last name, biography and publisher
 *
 * Must be able to retrieve a list of books associate with an author
 */

import java.math.BigInteger;
import java.util.Scanner;
public class IbrasFeature{

    public static String bookTitle = "";

    public static String Author = "";

    public static String ISBN = "";

    

    public void printResult(){

        System.out.println("JK Rowling");
        System.out.println(ISBN);

        if (bookTitle.equals("Hunger Games")){

            Author = ("Suzanne Collins");

            //ISBN = ("9780439023481");
            ISBN = ("1111");

            printResult();

        }
        else if (bookTitle.equals("Zift")){

            Author = ("Zaftoon");

            ISBN = ("69420");

            printResult();

        }

    }


    public static void main(String[] args) {

        System.out.println("Enter book title:");

        Scanner scan = new Scanner(System.in);

        bookTitle = scan.next();

        //printResult();

        /*
        if (bookTitle == "Hunger Games") {

            Author = "Suzanne Collins";

            ISBN = "9780439023481";

            printResult();

        }
        */





    }


}
