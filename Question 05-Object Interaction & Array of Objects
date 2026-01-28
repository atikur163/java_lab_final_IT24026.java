class Book {
    int bookId;
    String title;
    double price;

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book(1, "Java Basics", 300);
        books[1] = new Book(2, "OOP with Java", 700);
        books[2] = new Book(3, "Data Structures", 550);
        books[3] = new Book(4, "Database Systems", 450);
        books[4] = new Book(5, "Computer Networks", 600);

        double sum = 0;

        System.out.println("Books with price greater than 500:");
        for (int i = 0; i < books.length; i++) {
            if (books[i].price > 500) {
                System.out.println(
                    books[i].bookId + " " +
                    books[i].title + " " +
                    books[i].price
                );
            }
            sum += books[i].price;
        }

        double average = sum / books.length;
        System.out.println("Average Price: " + average);
    }
}
