public class MyMain {
    public static void main(String[] args) {
        PersonList persons = new PersonList();

        try {
            persons.store("persons.txt");

            System.out.println("Displaying all persons:");
            persons.display(System.out);

            System.out.println("\nTesting find:");
            System.out.println("Find ID 102 → index: " + persons.find("102"));
            System.out.println("Find ID 999 → index: " + persons.find("999"));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
