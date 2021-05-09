import creatures.AquaticMammal;
import creatures.SeaCreature;
import creatures.Squid;
import creatures.Whale;

import java.util.ArrayList;
import java.util.List;

public class SeaCreatureRunner {
    public static void main(String[] args) {
        SeaCreature[] elements = {
                new Squid(),
                new Whale(),
                new SeaCreature(),
                new AquaticMammal(),
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