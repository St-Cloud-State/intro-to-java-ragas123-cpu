import java.io.*;
import java.util.*;

public class MyMain {

    // Store persons from file into LinkedList
    public static void store(String fileName, LinkedList<Person> list) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNext()) {
            String firstName = scanner.next();
            String lastName = scanner.next();
            String id = scanner.next();
            list.add(new Person(firstName, lastName, id));
        }
        scanner.close();
    }

    // Display all persons
    public static void display(PrintStream out, LinkedList<Person> list) {
        for (Person p : list) {
            out.println(p);
        }
    }

    // Find person index by id
    public static int find(String sid, LinkedList<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        LinkedList<Person> persons = new LinkedList<>();
        try {
            store("persons.txt", persons);

            System.out.println("Displaying all persons:");
            display(System.out, persons);

            System.out.println("\nTesting find method:");
            System.out.println("Find ID 102 → index: " + find("102", persons));
            System.out.println("Find ID 999 → index: " + find("999", persons));

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
