package dejavu.game.graphics.guis;

import org.lwjgl.util.vector.Vector2f;

import dejavu.Main;
import dejavu.engine.graphics.Texture;
import dejavu.engine.graphics.guis.GuiButton;

public class ExitButton extends GuiButton{

	public ExitButton(Vector2f position, int zLayer, Vector2f scale, Texture texture) {
		super(position, zLayer, scale, texture);
	}

	@Override
	public void buttonClicked() {
		Main.closeGame();
	}

}