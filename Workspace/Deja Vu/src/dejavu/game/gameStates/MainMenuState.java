package dejavu.game.gameStates;

import java.util.ArrayList;
import java.util.List;

import dejavu.engine.entities.Entity;
import dejavu.engine.gameStates.GameState;
import dejavu.engine.graphics.guis.GuiComponent;
import dejavu.graphics.text.Text;

public class MainMenuState extends GameState{

	public MainMenuState(List<GuiComponent> guis, List<Text> strings) {
		super(null, null, guis, new ArrayList<Entity>(), strings);
	}

	@Override
	protected void update() {
	}

	@Override
	public void cleanUp() {
	}

}
