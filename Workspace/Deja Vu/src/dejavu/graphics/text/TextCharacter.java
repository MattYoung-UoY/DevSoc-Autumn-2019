package dejavu.graphics.text;

import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;

import dejavu.engine.graphics.Texture;
import dejavu.game.graphics.Drawable;

public class TextCharacter extends Drawable{

	protected TextCharacter(Vector3f position, float fontSize, Texture texture) {
		super(position, 0f, new Vector2f(fontSize * 0.5f, fontSize * 2f), texture);
	}

}
