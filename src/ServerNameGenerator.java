public class ServerNameGenerator {

    public static String[] adjectives = {"Nostalgic", "Spooky", "Luminescent", "Prestigious", "Fresh", "Troublesome", "Blinding", "Perpetual", "Disastrous", "Uneventful", "Burning", "Overgrown", "Unethical"};
    public static String[] nouns = {"Tree", "River", "Flower", "Canyon", "Mountain", "Asteroid", "Star", "Ocean", "Trench", "Wave", "Insect", "Parasite", "Plague"};

    public static String getRand(String[] arr) {
        return arr[(int)(Math.random() * arr.length)];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nYour server name: "+ "%s-%s\n", getRand(adjectives), getRand(nouns));
        }
    }
}
