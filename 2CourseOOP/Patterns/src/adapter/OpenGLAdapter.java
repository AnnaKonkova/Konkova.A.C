package adapter;

import adapter.interfaces.GraphicsLibrary;

public class OpenGLAdapter implements GraphicsLibrary {
    private final OpenGL openGL;

    public OpenGLAdapter(OpenGL openGL) {
        this.openGL = openGL;
    }

    @Override
    public void initialize() {
        openGL.initialize();
    }

    @Override
    public void render() {
        openGL.render();
    }

    @Override
    public void cleanup() {
        openGL.cleanup();
    }
}