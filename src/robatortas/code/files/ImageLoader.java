package robatortas.code.files;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	public BufferedImage getImageFromSource(String path) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(ImageLoader.class.getResource(path));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return image;
	}
	
	public void load() {
		
	}
}