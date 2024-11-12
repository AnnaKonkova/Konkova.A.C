package adapter;

import adapter.interfaces.GraphicsLibrary;

public class VulkanAdapter implements GraphicsLibrary {
    private final Vulkan vulkan;

    public VulkanAdapter(Vulkan vulkan) {
        this.vulkan = vulkan;
    }

    @Override
    public void initialize() {
        vulkan.initialize();
    }

    @Override
    public void render() {
        vulkan.render();
    }

    @Override
    public void cleanup() {
        vulkan.cleanup();
    }
}