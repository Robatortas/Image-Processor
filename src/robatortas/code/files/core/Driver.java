package robatortas.code.files.core;

import java.awt.Canvas;

public class Driver extends Canvas {

	private static final long serialVersionUID = 1L;
	
	public static int width = 720;
	public static int height = 520;
	public static String title = "Image Processor";
	
	private Painter painter;
	private Display display;
	public ImageLoader imageLoader;
	
	public Driver() {
		imageLoader = new ImageLoader();
		
		painter = new Painter(width, height, this);
		display = new Display(width, height, title, this);
	}
	
	public Display getDisplay() {
		return this.display;
	}
	
	public Painter getPainter() {
		return this.painter;
	}
	
	public ImageLoader getImageLoader() {
		return this.imageLoader;
	}
}