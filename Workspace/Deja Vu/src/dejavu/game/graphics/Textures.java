package dejavu.game.graphics;

import java.util.HashMap;
import java.util.Map;

import dejavu.engine.graphics.Texture;

public class Textures {

	public static Texture playerForward, playerBackward, playerLeft, playerRight, button, buttonDark, snowGrass;
	public static Map<Character, Texture> font1Chars;
	
	public static void setup() {
		playerForward = new Texture("res/textures/entities/player/forward.png");
		playerBackward = new Texture("res/textures/entities/player/backward.png");
		playerLeft = new Texture("res/textures/entities/player/left.png");
		playerRight = new Texture("res/textures/entities/player/right.png");
		button = new Texture("res/textures/guis/button.png");
		buttonDark = new Texture("res/textures/guis/buttonDark.png");
		snowGrass = new Texture("res/textures/tiles/snowGrass.png");
		
		font1Chars = new HashMap<Character, Texture>();
		font1Chars.put('a', new Texture("res/textures/fonts/font1/a.png"));
		font1Chars.put('b', new Texture("res/textures/fonts/font1/b.png"));
		font1Chars.put('c', new Texture("res/textures/fonts/font1/c.png"));
		font1Chars.put('d', new Texture("res/textures/fonts/font1/d.png"));
		font1Chars.put('e', new Texture("res/textures/fonts/font1/e.png"));
		font1Chars.put('f', new Texture("res/textures/fonts/font1/f.png"));
		font1Chars.put('g', new Texture("res/textures/fonts/font1/g.png"));
		font1Chars.put('h', new Texture("res/textures/fonts/font1/h.png"));
		font1Chars.put('i', new Texture("res/textures/fonts/font1/i.png"));
		font1Chars.put('j', new Texture("res/textures/fonts/font1/j.png"));
		font1Chars.put('k', new Texture("res/textures/fonts/font1/k.png"));
		font1Chars.put('l', new Texture("res/textures/fonts/font1/l.png"));
		font1Chars.put('m', new Texture("res/textures/fonts/font1/m.png"));
		font1Chars.put('n', new Texture("res/textures/fonts/font1/n.png"));
		font1Chars.put('o', new Texture("res/textures/fonts/font1/o.png"));
		font1Chars.put('p', new Texture("res/textures/fonts/font1/p.png"));
		font1Chars.put('q', new Texture("res/textures/fonts/font1/q.png"));
		font1Chars.put('r', new Texture("res/textures/fonts/font1/r.png"));
		font1Chars.put('s', new Texture("res/textures/fonts/font1/s.png"));
		font1Chars.put('t', new Texture("res/textures/fonts/font1/t.png"));
		font1Chars.put('u', new Texture("res/textures/fonts/font1/u.png"));
		font1Chars.put('v', new Texture("res/textures/fonts/font1/v.png"));
		font1Chars.put('w', new Texture("res/textures/fonts/font1/w.png"));
		font1Chars.put('x', new Texture("res/textures/fonts/font1/x.png"));
		font1Chars.put('y', new Texture("res/textures/fonts/font1/y.png"));
		font1Chars.put('z', new Texture("res/textures/fonts/font1/z.png"));
	}
	
}
