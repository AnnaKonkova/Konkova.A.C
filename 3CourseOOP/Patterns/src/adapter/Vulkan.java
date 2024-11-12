package adapter;

import adapter.interfaces.GraphicsLibrary;

public class Vulkan implements GraphicsLibrary {
    @Override
    public void initialize() {
        System.out.println("Initializing Vulkan...");
    }

    @Override
    public void render() {
        System.out.println("Rendering using Vulkan...");
    }

    @Override
    public void cleanup() {
        System.out.println("Cleaning up Vulkan...");
    }
}