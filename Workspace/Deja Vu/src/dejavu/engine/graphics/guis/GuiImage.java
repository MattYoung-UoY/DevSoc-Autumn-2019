package dejavu.engine.graphics.guis;

import org.lwjgl.util.vector.Vector2f;

import dejavu.engine.graphics.Texture;
import dejavu.engine.graphics.guis.GuiComponent;

public class GuiImage extends GuiComponent{

	public GuiImage(Vector2f position, int zLayer, Vector2f scale, Texture texture) {
		super(position, zLayer, scale, texture);
	}

	@Override
	public void update() {}

}