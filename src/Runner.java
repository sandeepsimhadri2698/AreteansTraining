import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Map<Integer, Book> map = new HashMap<Integer, Book>();
        Book b1 = new Book(101, "C Language", "Summit", "BPB", 8);
        Book b2 = new Book(102, "Data Communications", "Sandeep", "ABC", 4);
        Book b3 = new Book(103, "Analog Communications", "Harry", "XYZ", 10);
        Book b4 = new Book(104, "Digital Circuits", "Peter", "EFG", 1);
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        map.put(4,b4);
        System.out.println("Available Books: ");
        for (Map.Entry<Integer,Book> entry : map.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println("Book." +key);
            b.details();
        }
        System.out.println("Enter the book number want to read : ");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Book." +num);
        try {
            map.get(num).details();
        }catch(NullPointerException ex){
            System.out.print("Sorry we don't have book number : "+num);
        }
    }
}
