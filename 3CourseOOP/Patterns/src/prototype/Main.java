package prototype;

public class Main {
    public static void main(String[] args) {
        Document baseScenario = new Document("Schedule", 5, "presentation");
        GeneratiorDocument generator = new GeneratiorDocument(baseScenario);

        for (int i = 0; i < 5; i++) {
            Document randomScenario = generator.generateRandomScenario();
            System.out.println(randomScenario);
        }
    }
}