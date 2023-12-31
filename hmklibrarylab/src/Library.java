import java.util.*;

//refactor code
public class Library {
        // Add the missing implementation to this class
        String address;
        LinkedList<Book> bookList = new LinkedList<Book>();
        //list of objects


        public Library(String address) {
            this.address = address;
        }

        public void addBook(Book book){
            bookList.add(book);
        }

        public void borrowBook(String title){ // borrowed book title

                for(int i = 0; i < bookList.size(); i++){
                    Book b2 = bookList.get(i);
                    if(b2.getTitle() == title){
                        b2.borrowed();
                    }
                }
        }
        public void printAvailableBooks(){
            for(int i = 0; i < bookList.size(); i++){
                Book b3 = bookList.get(i); //get object
                if(b3.isBorrowed() == false){
                    System.out.println("Available title: " + b3.getTitle());
                }
                }
        }

        public void returnBook(String title){
            for(int i = 0; i < bookList.size(); i++){
                Book b2 = bookList.get(i);
                if(b2.getTitle() == title){
                    b2.returned();
                }
            }
        }

        static void printOpeningHours(){
            System.out.println("Libraries are open daily from 9am to 5pm.");
        }

        public String printAddress(){
            System.out.println(address);
            return this.address;
        }

        public static void main(String[] args) {
            // Create two libraries
            Library firstLibrary = new Library("10 Main St.");
            Library secondLibrary = new Library("228 Liberty St.");

            // Add four books to the first library
            firstLibrary.addBook(new Book("The Da Vinci Code"));
            firstLibrary.addBook(new Book("Le Petit Prince"));
            firstLibrary.addBook(new Book("A Tale of Two Cities"));
            firstLibrary.addBook(new Book("The Lord of the Rings"));

            //Not part of the assignment - I added this code
            secondLibrary.addBook(new Book("The Da Vinci Code"));
            secondLibrary.addBook(new Book("Le Petit Prince"));
            secondLibrary.addBook(new Book("A Tale of Two Cities"));
            secondLibrary.addBook(new Book("The Lord of the Rings"));

            // Print opening hours and the addresses
            System.out.println("Library hours:");
            printOpeningHours();
            System.out.println();

            System.out.println("Library addresses:");
            firstLibrary.printAddress();
            secondLibrary.printAddress();
            System.out.println();

            // Try to borrow The Lords of the Rings from both libraries
            System.out.println("Borrowing The Lord of the Rings:");
            firstLibrary.borrowBook("The Lord of the Rings");
            //firstLibrary.borrowBook("The Lord of the Rings");
            secondLibrary.borrowBook("The Lord of the Rings");
            System.out.println();

            // Print the titles of all available books from both libraries
            System.out.println("Books available in the first library:"); // lord of the rings not borrowed
            firstLibrary.printAvailableBooks();
            System.out.println();
            System.out.println("Books available in the second library:");
            secondLibrary.printAvailableBooks();
            System.out.println();


            // Return The Lords of the Rings to the first library
            System.out.println("Returning The Lord of the Rings:");
            firstLibrary.returnBook("The Lord of the Rings");
            System.out.println();

            // Print the titles of available from the first library
            System.out.println("Books available in the first library:");
            firstLibrary.printAvailableBooks();


        }
    }

