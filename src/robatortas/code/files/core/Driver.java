package robatortas.code.files.core;

import java.awt.Canvas;
import java.awt.event.MouseListener;

public class Driver extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;
	
	public static int width = 720;
	public static int height = 520;
	public static String title = "Image Processor";
	
	private Painter painter;
	private Display display;
	public ImageLoader imageLoader;
	public MouseManager mouseManager;
	
	private Thread thread;
	private boolean running = false;
	
	public Driver() {
		imageLoader = new ImageLoader();
		painter = new Painter(width, height, this);
		mouseManager = new MouseManager();
		display = new Display(width, height, title, this);
		
		addMouseListener(mouseManager);
		addMouseMotionListener(mouseManager);
	}
	
	public synchronized void start() {
		this.thread = new Thread(this, "MAIN_THREAD");
		thread.start();
		this.running = true;
	}
	
	public synchronized void stop() {
		try {
			this.thread.join();
		} catch (InterruptedException e) {
			Logger.logError("Unable to kill " + thread.getName() + " thread\n");
			Logger.logJVMError(e);
		}
		running = false;
	}
	
	public void run() {
		while(running) {
			Logger.log(Boolean.toString(mouseManager.mousePressed));
		}
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