import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DatasetReader {
    public List<Books.Book> readBooksFromCSV(String filePath) {
        List<Books.Book> books = new ArrayList<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                if (values.length == 7) {
                    String title = values[0];
                    String author = values[1];
                    double userRating = Double.parseDouble(values[2]);
                    int reviews = Integer.parseInt(values[3]);
                    double price = Double.parseDouble(values[4]);
                    int year = Integer.parseInt(values[5]);
                    String genre = values[6];

                    books.add(new Books.Book(title, author, userRating, reviews, price, year, genre));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return books;
    }
}