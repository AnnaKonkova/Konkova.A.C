package compositer;

public class Main {
    public static void main(String[] args) {
        // Создаем текстовые и графические элементы
        DocumentElement text1 = new TextElement("Hello, World!");
        DocumentElement image1 = new ImageElement("path/to/image1.png");
        DocumentElement text2 = new TextElement("This is a composite document.");

        // Создаем составной документ
        CompositeDocument compositeDocument = new CompositeDocument();
        compositeDocument.addElement(text1);
        compositeDocument.addElement(image1);
        compositeDocument.addElement(text2);

        // Отображаем составной документ
        System.out.println("Rendering Composite Document:");
        compositeDocument.render();
    }
}