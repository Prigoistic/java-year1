import java.util.List;

public class Driver {
    public static void main(String[] args) {
        DatasetReader datasetReader = new DatasetReader();
        List<Books.Book> books = datasetReader.readBooksFromCSV("C:\\Users\\CROMA\\Downloads\\bestsellers with categories.csv");


        for (Books.Book book : books) {
            book.printDetails();
        }


    }
}