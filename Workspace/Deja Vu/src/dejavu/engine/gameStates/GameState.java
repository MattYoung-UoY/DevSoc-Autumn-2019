package dejavu.engine.gameStates;

import java.util.ArrayList;
import java.util.List;

import dejavu.engine.entities.Entity;
import dejavu.engine.graphics.guis.GuiComponent;
import dejavu.game.entities.Player;
import dejavu.game.map.Map;
import dejavu.graphics.text.Text;

public abstract class GameState {

	private List<Entity> entities;
	private Map map;
	private List<GuiComponent> guis;
	private List<Text> strings;

	public GameState(Player player, Map map, List<GuiComponent> guis, List<Entity> entities, List<Text> strings) {
		this.map = map;
		this.guis = guis;
		if (entities != null)
			this.entities = entities;
		else
			this.entities = new ArrayList<Entity>();
		if (player != null)
			this.entities.add(player);
		this.strings = strings;
	}

	protected abstract void update();

	public abstract void cleanUp();

	public void updateState() {
		update();
		updateGuis();
		updateEntities();
	}

	private void updateEntities() {
		for (Entity entity : entities) {
			entity.move();
		}
	}

	private void updateGuis() {
		if (guis != null) {
			for (GuiComponent gui : guis) {
				gui.update();
			}
		}
	}

	public Map getMap() {
		return map;
	}

	public List<GuiComponent> getGuis() {
		return guis;
	}

	public List<Entity> getEntities() {
		return entities;
	}

	public List<Text> getStrings() {
		return strings;
	}

}