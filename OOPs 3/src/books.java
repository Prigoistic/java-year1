public class books {
    public class book{
         String name;
         int rating;
         int reviews;
         int year;
         String genre;
         int price;

        public book(String name, int rating, int reviews, int year, String genre, int price) {
            this.name = name;
            this.rating = rating;
            this.reviews = reviews;
            this.year = year;
            this.genre = genre;
            this.price = price;
        }


    }

    public void main(String[] args) {
        book book1 = new book("death",4,45,2004,"horror",100);
        System.out.println(book1.name);
    }



}
