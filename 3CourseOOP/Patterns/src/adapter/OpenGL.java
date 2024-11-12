package adapter;

import adapter.interfaces.GraphicsLibrary;

public class OpenGL implements GraphicsLibrary {
    @Override
    public void initialize() {
        System.out.println("Initializing OpenGL...");
    }

    @Override
    public void render() {
        System.out.println("Rendering using OpenGL...");
    }

    @Override
    public void cleanup() {
        System.out.println("Cleaning up OpenGL...");
    }
}
