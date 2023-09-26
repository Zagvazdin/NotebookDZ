import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Lenovo", 8, "Windows10", 700));
        set.add(new Notebook("HP", 16, "Windows10", 650));
        set.add(new Notebook("Asus", 32, "linux", 850));
        set.add(new Notebook("Chuwi", 64, "linux", 900));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}
