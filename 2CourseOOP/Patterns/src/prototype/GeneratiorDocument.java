package prototype;

import java.util.Random;

public class GeneratiorDocument {
    private Document baseDocument;

    public GeneratiorDocument(Document baseDocument) {
        this.baseDocument = baseDocument;
    }
    public Document generateRandomScenario() {
        Document clonedDocument = (Document) baseDocument.clone();

        String[] nameDocument = {"Accounting", "Schedule", "Tasks", "Participants"};
        String[] subjectDocument = {"Report", "account","presentation"};

        Random random = new Random();
        int newDepartmentNumber = random.nextInt(10) + 1;
        String newNameDocument = nameDocument[random.nextInt(nameDocument.length)];
        String newSubjectDocument = subjectDocument[random.nextInt(subjectDocument.length)];

        clonedDocument.modifyScenario(newNameDocument, newDepartmentNumber, newSubjectDocument);

        return clonedDocument;
    }
}