package adapter;

import adapter.interfaces.GraphicsLibrary;

public class DirectX implements GraphicsLibrary {
    @Override
    public void initialize() {
        System.out.println("Initializing DirectX...");
    }

    @Override
    public void render() {
        System.out.println("Rendering using DirectX...");
    }

    @Override
    public void cleanup() {
        System.out.println("Cleaning up DirectX...");
    }
}
