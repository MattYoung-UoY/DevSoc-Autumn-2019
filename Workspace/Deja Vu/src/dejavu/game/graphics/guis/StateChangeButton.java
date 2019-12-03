package dejavu.game.graphics.guis;

import org.lwjgl.util.vector.Vector2f;

import dejavu.Main;
import dejavu.engine.gameStates.GameState;
import dejavu.engine.graphics.Texture;
import dejavu.engine.graphics.guis.GuiButton;

public class StateChangeButton extends GuiButton{

	GameState nextState;
	
	public StateChangeButton(Vector2f position, int zLayer, Vector2f scale, Texture texture, GameState nextState) {
		super(position, zLayer, scale, texture);
		this.nextState = nextState;
	}

	@Override
	public void buttonClicked() {
		Main.changeGameState(nextState);
	}

}
