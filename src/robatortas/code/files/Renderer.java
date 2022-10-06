package robatortas.code.files;

import java.awt.Canvas;
import java.awt.Graphics;

public class Renderer extends Canvas {
	private static final long serialVersionUID = 1L;
	
	private ImageLoader imageLoader;
	
	public void render() {
		// TODO: RENDER IMAGE ON WINDOW!!
		Graphics g;
		g.drawImage(imageLoader.getImageFromSource("ducks.png"), 0, 0, imageLoader.getWidth(), imageLoader.getHeight(), null);
	}
}