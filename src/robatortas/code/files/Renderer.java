package robatortas.code.files;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import robatortas.code.files.core.Driver;

public class Renderer {
	
	private BufferedImage image;
	
	private Driver driver;
	
	public Renderer(Driver driver) {
		this.driver = driver;
	}
	
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