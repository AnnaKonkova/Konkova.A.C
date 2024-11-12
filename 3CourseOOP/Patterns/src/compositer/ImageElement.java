package compositer;

public class ImageElement implements DocumentElement {
    private String imagePath;

    public ImageElement(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void render() {
        System.out.println("Image: " + imagePath);
    }
}