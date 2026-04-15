package library.main;

import library.model.Book;
import library.service.LibraryService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryService lib = new LibraryService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Book\n2. Show Books\n3. Borrow\n4. Return\n5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    lib.addBook(new Book(id, title, author));
                    break;

                case 2:
                    lib.showBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    lib.borrowBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    lib.returnBook(sc.nextInt());
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}