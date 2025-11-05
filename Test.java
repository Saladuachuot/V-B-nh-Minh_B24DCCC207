package Generic_test;
import java.util.*;

class Block<T> {
    private List<T> items = new ArrayList<>();
    public void add(T item) {
        items.add(item);
        System.out.println("Đã thêm: " + item);
    }

    public T get(int index) {
        return items.get(index);
    }

    public void showAll() {
        System.out.println("Danh sách: " + items);
    }
}

class Book {
    private String name;
    public Book(String name) { this.name = name; }
    @Override
    public String toString() {
        return "Book: " + name;
    }
}

class Phone {
    private String brand;
    public Phone(String brand) { this.brand = brand; }
    @Override
    public String toString() {
        return "Phone: " + brand;
    }
}

class Food {
    private String name;
    public Food(String name) { this.name = name; }
    @Override
    public String toString() {
        return "Food: " + name;
    }
}

public class Test {
    public static void main(String[] args) {

        Block<Book> bookBlock = new Block<>();
        Block<Phone> phoneBlock = new Block<>();
        Block<Food> foodBlock = new Block<>();

        bookBlock.add(new Book("Harry Potter"));
        phoneBlock.add(new Phone("iPhone"));
        foodBlock.add(new Food("Gạo"));

        bookBlock.showAll();
        phoneBlock.showAll();
        foodBlock.showAll();
    }
}
