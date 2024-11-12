package adapter;

import adapter.interfaces.GraphicsLibrary;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляров графических библиотек
        GraphicsLibrary openGL = new OpenGLAdapter(new OpenGL());
        GraphicsLibrary directX = new DirectXAdapter(new DirectX());
        GraphicsLibrary vulkan = new VulkanAdapter(new Vulkan());

        // Инициализация и рендеринг с использованием OpenGL
        openGL.initialize();
        openGL.render();
        openGL.cleanup();

        System.out.println();

        // Инициализация и рендеринг с использованием DirectX
        directX.initialize();
        directX.render();
        directX.cleanup();

        System.out.println();

        // Инициализация и рендеринг с использованием Vulkan
        vulkan.initialize();
        vulkan.render();
        vulkan.cleanup();
    }
}