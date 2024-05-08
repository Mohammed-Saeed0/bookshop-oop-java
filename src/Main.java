import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("----Main Menu----");
            System.out.println("1_Display all books");
            System.out.println("2_Add book");
            System.out.println("3_Update book");
            System.out.println("4_Delete book");
            System.out.println("5_Search book");
            System.out.println("6_Exit");
            System.out.println();
            System.out.println("Enter your choice : ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    Book.displayAllBook();
                    break;
                case 2:
                    Book.addBooks(input);
                    break;
                case 3:
                    boolean isTrue = true;
                    while (isTrue) {
                        System.out.println("----Update Menu----");
                        System.out.println("1_Update book Name");
                        System.out.println("2_Update book Author");
                        System.out.println("3_Update book Price");
                        System.out.println("4_Back to the main menu");
                        System.out.println("5_Exit");
                        System.out.println();
                        System.out.println("Enter your choice : ");
                    }
                    int choice1 = input.nextInt();
                    switch (choice1) {
                        case 1:
                            System.out.println("Enter your book name : ");
                            String bookName = input.next();
                            Book book = Book.getBookByName(bookName);
                            if (book == null)
                                System.out.println("There is no book with this name");
                            else {
                                book.setName(bookName);
                            }

                case 4:
                    System.out.println("hello");
                    break;
                case 5:
                    System.out.println("hello");
                    break;
                case 6:
                    return;
            }
        }
    }
}
}