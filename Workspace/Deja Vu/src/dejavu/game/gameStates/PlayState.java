package dejavu.game.gameStates;

import java.util.List;

import org.lwjgl.input.Keyboard;

import dejavu.Main;
import dejavu.engine.entities.Entity;
import dejavu.engine.gameStates.GameState;
import dejavu.engine.graphics.guis.GuiComponent;
import dejavu.game.entities.Player;
import dejavu.game.map.Map;
import dejavu.graphics.text.Text;

public class PlayState extends GameState{
	
	public PlayState(Player player, Map map, List<GuiComponent> guis, List<Entity> entities, List<Text> strings) {
		super(player, map, guis, entities, strings);
	}

	@Override
	public void update() {
		if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) Main.changeGameState(GameStates.menuState);
	}

	@Override
	public void cleanUp() {
	}

}
