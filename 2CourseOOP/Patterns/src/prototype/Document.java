package prototype;

public class Document implements Prototype {
    private String nameDocument;
    private int departmentNumber;
    private String subjectDocument;

    public Document(String nameDocument, int departmentNumber, String subjectDocument) {
        this.nameDocument = nameDocument;
        this.departmentNumber = departmentNumber;
        this.subjectDocument = subjectDocument;
    }

    @Override
    public Prototype clone() {
        return new Document(nameDocument, departmentNumber, subjectDocument);
    }

    public void modifyScenario(String nameDocument, int departmentNumber, String subjectDocument) {
        this.nameDocument = nameDocument;
        this.departmentNumber = departmentNumber;
        this.subjectDocument = subjectDocument;
    }

    @Override
    public String toString() {
        return "Documents {" +
                "nameDocument='" + nameDocument + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", subjectDocument='" + subjectDocument + '\'' +
                '}';
    }
}