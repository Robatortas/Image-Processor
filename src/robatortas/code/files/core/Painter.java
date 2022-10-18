package robatortas.code.files.core;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;

import robatortas.code.files.Renderer;

/**<NEWLINE>
 * <b>Painter class</b>
 * <br><br>
 * Class to paint stuff into the JFrame.
 * <br>
 * (Extends JPanel)
 * 
 * @see JPanel
 * @see JFrame
 */
public class Painter extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private int width, height;
	
	private Driver driver;
	
	private JPanel panel;
	
	private Renderer renderer;
	
	private MouseManager mouseManager;
	
	private Canvas canvas;
	
	/**<NEWLINE>
	 * <b>Painter function in Painter class</b>
	 * <br><br>
	 * Painter class' function.
	 * 
	 * @param width The width of the image.
	 * @param height The height of the image
	 * @param driver The driver class
	 * 
	 * @see Driver
	 */
	public Painter(int width, int height, Driver driver) {
		this.canvas = new Canvas();
		this.driver = driver;
		this.width = width;
		this.height = height;
		this.renderer = new Renderer(driver);
		
		mouseManager = new MouseManager();
		addMouseListener(mouseManager);
		addMouseMotionListener(mouseManager);
	}
	
	public ImageLoader imageLoader;
	
	/**<NEWLINE>
	 * <b>paintComponent function in Painter class</b>
	 * <br><br>
	 * Uses JPanel to paint images to the JFrame.
	 * 
	 * @param g Graphics component
	 * 
	 * @see Graphics
	 * @see JPanel
	 * @see JFrame
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		BufferStrategy bs = canvas.getBufferStrategy();
		if(bs == null) {
			canvas.createBufferStrategy(3);
			return;
		}
		
		// Function that tells what to render
		renderer.render(g);
	}
}