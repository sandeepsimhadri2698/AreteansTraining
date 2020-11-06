import java.util.HashMap;
import java.util.Map;

class Book {
        int id;
        String name,author,publisher;
        int quantity;
        public Book(int id, String name, String author, String publisher, int quantity) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            this.quantity = quantity;
        }
        public void details() {
            System.out.println("Book ID: "+id + "," +"Name: "+name + "," +"Author: "+author + "," +"Publisher: "+publisher + "," +"Quantity: "+quantity);
        }
}

