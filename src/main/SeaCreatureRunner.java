import java.util.ArrayList;
import java.util.List;

public class SeaCreatureRunner {
    public static void main(String[] args) {
        SeaCreature[] elements = {
                new SeaCreature(),
                new SeaCreature(),
                new SeaCreature(),
                new SeaCreature(),
        };

        List<String> list = new ArrayList<>();
        for (SeaCreature element : elements) {
            System.out.println(element);
            element.method1();
            element.method2();
            System.out.println();
        }
    }
}