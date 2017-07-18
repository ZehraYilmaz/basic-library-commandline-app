import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Book[] book = new Book[2];

        while (true) {
            menu();
            Scanner select = new Scanner(System.in);
            String sel = select.next();
            switch (sel) {
                case "A":
                    System.out.println("Your choice: " + sel);
                    insert();
                    break;
                case "D":
                    System.out.println("Your choice: " + sel);
                    String key = select.next();
                    delete(book, key);
                    break;
                case "S":
                    System.out.println("Your choice: " + sel);
                    sort();
                    break;
                case "X":
                    System.out.println("Your choice: " + sel);
                    display();
                    break;
                case "Q":
                    System.out.println("Your choice: " + sel);
                    System.out.println("Goodbye!");

                    System.exit(0);

            }
        }


    }

    private static void menu() {
        System.out.println("Press A to insert a book\n" +
                "Press D to delete a book\n" +
                "Press S to sort all books\n" +
                "Press X to display all books\n" +
                "Press Q to exit\n");

    }

    private static void sort() {
    }

    private static void display() {
    }

    public static void delete(Book[] bookArray, String aWord){
        int i;
        for(i = 0; i<bookArray.length; i++){
            if(bookArray[i].searchkeyWord(aWord)){
                bookArray[i]=null;

            }
            break;
        }

        for(int k=i; k<bookArray.length-1; k++){

            bookArray[k] = bookArray[k+1];

            }

    }

    private static void insert() {
        Scanner insert= new Scanner(System.in);
        String[] book= insert.nextLine().split(",");
        String[] keys = Arrays.copyOfRange(book,5,book.length);
        Book newBook= new Book(book[0].trim(),book[1].trim(),book[2].trim(),Integer.parseInt(book[3].trim()),Integer.parseInt(book[4].trim()),keys);

        System.out.println("\nAdded!");




    }


}

