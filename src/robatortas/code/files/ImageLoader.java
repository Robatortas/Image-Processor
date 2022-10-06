package robatortas.code.files;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	private int[] pixels;
	private int width, height;
	
	public BufferedImage getImageFromSource(String path) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(ImageLoader.class.getResource(path));
			Logger.log("Image at: " + path + " found!");
		} catch (IOException e) {
			Logger.logError("Unable to read the image in the specified location of: " + path + "\n\n");
			Logger.logJVMError(e);
		}
		return image;
	}
	
	public void imageToPixel(BufferedImage image) {
		int w = image.getWidth();
		int h = image.getHeight();
		pixels = new int[w*h];
		image.getRGB(0, 0, w, h, pixels, 0, w);
	}
	
//	public void load() {
//		for(int y = 0; y < height; y++) {
//			for(int x = 0; x < width; x++) {
//				
//			}
//		}
//	}
	
	
	// GETTERS AND SETTERS!
	
	public int[] getPixels() {
		return this.pixels;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
}