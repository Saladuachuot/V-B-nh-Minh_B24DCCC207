package Generic_test;
import java.util.ArrayList;
import java.util.List;

public class Test {
    static class Block<T> {
        String name; List<T> items = new ArrayList<>();
        Block(String name){ this.name = name; }
        void add(T it){ items.add(it); }
        void display(){
            System.out.println("== "+name+" ("+items.size()+") ==");
            if(items.isEmpty()) System.out.println("(Trống)");
            else items.forEach(i -> System.out.println(i));
        }
    }

    static class Book { String id,title; Book(String i,String t){id=i;title=t;} public String toString(){return "Book["+id+" "+title+"]";} }
    static class Phone{ String id,model; Phone(String i,String m){id=i;model=m;} public String toString(){return "Phone["+id+" "+model+"]";} }
    static class Food { String id,name; Food(String i,String n){id=i;name=n;} public String toString(){return "Food["+id+" "+name+"]";} }

    public static void main(String[] args){
        Block<Book> books = new Block<>("Books");
        Block<Phone> phones = new Block<>("Phones");
        Block<Food> foods = new Block<>("Foods");

        books.add(new Book("B1","Java Basics"));
        phones.add(new Phone("P1","Galaxy"));
        foods.add(new Food("F1","Bread"));

        books.display();
        phones.display();
        foods.display();
    }
}
