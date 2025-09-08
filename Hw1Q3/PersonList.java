import java.io.*;
import java.util.*;

public class PersonList {
    private LinkedList<Person> list;

    public PersonList() {
        list = new LinkedList<>();
    }

    // store persons from file into the list
    public void store(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNext()) {
            String firstName = scanner.next();
            String lastName = scanner.next();
            String id = scanner.next();
            list.add(new Person(firstName, lastName, id));
        }
        scanner.close();
    }

    // display all persons
    public void display(PrintStream out) {
        for (Person p : list) {
            out.println(p);
        }
    }

    // find person index by id
    public int find(String sid) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }
}
