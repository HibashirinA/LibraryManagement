import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add book");
            System.out.println("2. Show books");
            System.out.println("3. Issue book");
            System.out.println("4. Return book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
                choice = 0;
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Book ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;
                case 2:
                    library.showBooks();
                    break;
                case 3:
                    System.out.print("Book ID to issue: ");
                    library.issueBook(Integer.parseInt(sc.nextLine()));
                    break;
                case 4:
                    System.out.print("Book ID to return: ");
                    library.returnBook(Integer.parseInt(sc.nextLine()));
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}