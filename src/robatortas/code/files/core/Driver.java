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
		
		painter = new Painter(width, height, this);
		display = new Display(width, height, title, this);
		imageLoader = new ImageLoader();
		
		
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
	
	// Timer
	public static int fps;
	private static int ticks = 0;
	public static boolean vSync = false;	
	public static int tickCount = 0;
	public static double tps = 60.0;
	public static double delta = 0;
	
	public void run() {
//		long lastTime = System.nanoTime();
//		long timer = System.currentTimeMillis();
//		//converts nanoseconds to milliseconds
//		final double ns = 1000000000.0 / tps;
//		double delta = 0;
//		
//		while(running) {
//			long now = System.nanoTime();
//			delta += (now - lastTime) / ns;
//			lastTime = now;
//			while (delta >= 1) {
//				tick();
//				ticks++;	
//				delta--;
//			}
//			if(System.currentTimeMillis() - timer > 1000) {
//				timer += 1000;
//				ticks = 0;
//			}
//		}
//		stop();
	}
	
	public void tick() {
		Logger.log(mouseManager.getMouseX() + " HELLO");
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