package dejavu;

import org.lwjgl.opengl.Display;
import org.lwjgl.util.vector.Vector2f;

import dejavu.engine.gameStates.GameState;
import dejavu.engine.graphics.Camera;
import dejavu.engine.graphics.DisplayManager;
import dejavu.engine.graphics.Loader;
import dejavu.engine.graphics.Render;
import dejavu.engine.graphics.Texture;
import dejavu.engine.input.MouseHandler;
import dejavu.game.gameStates.GameStates;
import dejavu.game.graphics.Textures;

public class Main {

	private static boolean running = true;

	private static GameState currentGameState;

	public static Texture roadVert, grass, flowers;

	private static Camera camera;

	public static void main(String[] args) {

		DisplayManager.createDisplay();

		Render renderer = new Render();
		camera = new Camera(new Vector2f(-Config.START_POSITION.x, -Config.START_POSITION.y));
		renderer.setCamera(camera);

		Textures.setup();
		GameStates.setup();
		
		currentGameState = GameStates.menuState;

		while (!Display.isCloseRequested() && running) {

			MouseHandler.update();

			currentGameState.updateState();

			renderer.prepare();
			renderer.render(currentGameState);

			DisplayManager.updateDisplay();
		}

		currentGameState.cleanUp();
		renderer.cleanUp();
		Loader.cleanUp();
		DisplayManager.closeDisplay();

	}

	public static void increaseCameraPosition(Vector2f deltaPos) {
		Vector2f startPos = camera.getPosition();
		Vector2f nextPos = new Vector2f(startPos.x + deltaPos.x, startPos.y + deltaPos.y);
		camera.setPosition(nextPos);
	}

	public static void setCameraPosition(Vector2f pos) {
		camera.setPosition(pos);
	}

	public static void changeGameState(GameState nextState) {
		currentGameState.cleanUp();
		currentGameState = nextState;
	}

	public static void closeGame() {
		running = false;
	}

}
