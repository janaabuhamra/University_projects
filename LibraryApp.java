
package lists_code;


public class LibraryApp {
    public static void main(String[] args) {
        ArraySortedList<Book> bookList = new ArraySortedList<>();

        // Adding several Book objects
        bookList.add(new Book("978-3-16-148410-0", "Java Programming", 400));
        bookList.add(new Book("123-4-56-789012-3", "Data Structures", 350));
        bookList.add(new Book("234-5-67-890123-4", "Algorithms", 500));
        bookList.add(new Book("345-6-78-901234-5", "Database Systems", 450));
        bookList.add(new Book("456-7-89-012345-6", "Computer Networks", 300));
        bookList.add(new Book("567-8-90-123456-7", "Operating Systems", 420));

        System.out.println("Full Book List:");
        System.out.println(bookList);

        ArraySortedList<Book> resultList = filterBooksByTitle(bookList, "Data");
        System.out.println("**************************************************");
        System.out.println("Static Method: filterBooksByTitle()");
        System.out.println("**************************************************");
        System.out.println(resultList);

        // Example to remove First Half (optional)
        bookList.removeFirstHalf();
        System.out.println("**************************************************");
        System.out.println("Instance Method: bookList.removeFirstHalf()");
        System.out.println("**************************************************");
        System.out.println(bookList);
    }

   public static ArraySortedList<Book> filterBooksByTitle(ArraySortedList<Book> bookList, String searchTitle) {
        ArraySortedList<Book> result = new ArraySortedList<>();
        bookList.reset();

        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.getNext();
            if (book.getTitle().toLowerCase().contains(searchTitle.toLowerCase())) {
                result.add(book);
            }
        }

        return result;
    }

}

