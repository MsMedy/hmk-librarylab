public class Book {

    //refactor code
        String title;
        boolean borrow;

        // Creates a new Book
        public Book(String title) {
            this.title = title;
        }

        // Marks the book as rented
        public void borrowed() {
            this.borrow = true;
        }

        // Marks the book as not rented
        public void returned() {
            // Implement this method
            this.borrow = false;
        }
        public void rented(){ // Left this method in, but this code is duplicated in borrowed
            this.borrow = true;
        }

        // Returns true if the book is rented, false otherwise
        public boolean isBorrowed() {
            // Implement this method
            if(borrow == true){
                return true;
            }else {
                return false;
            }
        }

        // Returns the title of the book
        public String getTitle() {
            // Implement this method
            return title;
        }

        public static void main(String[] arguments) {
            // Small test of the Book class
            Book example = new Book("The Da Vinci Code");
            System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
            System.out.println("Borrowed? (should be false): " + example.isBorrowed());
            example.rented();
            System.out.println("Borrowed? (should be true): " + example.isBorrowed());
            example.returned();
            System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        }
    }

