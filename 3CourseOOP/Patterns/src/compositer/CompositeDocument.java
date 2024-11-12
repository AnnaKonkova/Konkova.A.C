package compositer;

import java.util.ArrayList;
import java.util.List;

public class CompositeDocument implements DocumentElement {
    private List<DocumentElement> elements = new ArrayList<>();

    // Метод для добавления элемента
    public void addElement(DocumentElement element) {
        elements.add(element);
    }

    // Метод для удаления элемента
    public void removeElement(DocumentElement element) {
        elements.remove(element);
    }

    @Override
    public void render() {
        for (DocumentElement element : elements) {
            element.render(); // Вызываем метод render для каждого элемента
        }
    }
}