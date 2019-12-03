package dejavu.engine.entities;

import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;

import dejavu.engine.graphics.Moveable;
import dejavu.engine.graphics.Texture;
import dejavu.game.graphics.Drawable;

public abstract class Entity extends Drawable implements Moveable{

	protected Texture forward, backward, left, right;
	
	protected Entity(Vector2f position, float rotation, Vector2f size, Texture forward, Texture backward, Texture left, Texture right) {
		super(new Vector3f(position.x, position.y, -9.9f), rotation, size, backward);
		this.forward = forward;
		this.backward = backward;
		this.left = left;
		this.right = right;
	}
	
}
