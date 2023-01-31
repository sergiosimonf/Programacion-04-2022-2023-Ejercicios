package factories;

import models.Trumpeter;

public class TrumpeterFactory {
    public static int counter = 0;

    public static Trumpeter createRandomTrumpeter() {
        String[] names = {
                "Paquita",
                "Ernesto",
                "Antonio",
                "Alfonso",
                "Patricio",
                "BobEsponja",
                "Arenita",
                "DonCangrejo",
                "Calamardo",
                "Juan",
                "Laura",
                "Aitana",
                "Aitor",
                "Juanjo",
                "Paco"
        };

        int[] expYears = {
                2,
                4,
                25,
                6,
                8,
                54,
                56,
                3,
                6,
                27,
                4,
                1,
                7,
                36,
                0,
                13
        };

        int[] lungsCapacity = {
                2,
                4,
                25,
                6,
                8,
                54,
                56,
                3,
                6,
                27,
                4,
                1,
                7,
                36,
                0,
                13
        };

        String name = names[(int) (Math.random() * names.length)];
        int yearsOfExperience = expYears[(int) (Math.random() * expYears.length)];
        int lungCapacity = lungsCapacity[(int) (Math.random() * lungsCapacity.length)];
        counter++;
        return new Trumpeter(name, yearsOfExperience, lungCapacity);

    }

}
