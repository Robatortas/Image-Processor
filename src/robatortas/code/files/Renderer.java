package robatortas.code.files;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import robatortas.code.files.core.Driver;

/**<NEWLINE>
 * <b>Renderer class</b>
 * <br><br>
 * Tells the Painter class what should be rendered
 * 
 * @see robatortas.code.files.core.Painter
 */
public class Renderer {
	
	private BufferedImage image;
	
	private Driver driver;
	
	public Renderer(Driver driver) {
		this.driver = driver;
	}
	
	/**<NEWLINE>
	 * <b>render function in Renderer class</b>
	 * <br><br>
	 * Here goes what should be rendered.
	 * 
	 * @param g The Graphics class in java
	 */
	public void render(Graphics g) {
		image = driver.imageLoader.loadImageFromSource("/ducks.png");
		int w = image.getWidth();
		int h = image.getHeight();
		
		g.drawImage(image, 0, 0, w*2, h*2, null);
	}
	
	public BufferedImage getImage() {
		return this.image;
	}
}