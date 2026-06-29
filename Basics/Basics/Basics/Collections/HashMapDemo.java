import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Medha");
        students.put(102, "Harini");
        students.put(103, "Priya");

        System.out.println("Students: " + students);

        System.out.println("Student with ID 101: " + students.get(101));

        students.remove(102);

        System.out.println("After removal: " + students);
    }
}
