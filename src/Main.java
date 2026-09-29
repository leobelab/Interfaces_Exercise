import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.run();

    }

    public void run() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", "Smith"));
        people.add(new Person("Charlie", "Johnson"));
        people.add(new Person("Davida", "Chalton"));
        people.add(new Person("David", "Chalton"));
        people.add(new Person("Bobby", "Smith"));

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(3, 4));
        rectangles.add(new Rectangle(5, 6));
        rectangles.add(new Rectangle(4, 5));
        rectangles.add(new Rectangle(6, 7));
        /*
        Sorter sorter_1 = new Sorter();
        sorter_1.sort(people, people.size());
        sorter_1.sort(rectangles, rectangles.size());
        */
        Collections.sort(people);
        Collections.sort(rectangles);
        for (Person person : people) {
            System.out.println(person.name + " " + person.surname);
        }
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.getArea());
        }

    }
}