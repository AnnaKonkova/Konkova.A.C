package adapter;

import adapter.interfaces.GraphicsLibrary;

public class DirectXAdapter implements GraphicsLibrary {
    private final DirectX directX;

    public DirectXAdapter(DirectX directX) {
        this.directX = directX;
    }

    @Override
    public void initialize() {
        directX.initialize();
    }

    @Override
    public void render() {
        directX.render();
    }

    @Override
    public void cleanup() {
        directX.cleanup();
    }
}