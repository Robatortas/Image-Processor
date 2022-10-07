package robatortas.code.files.core;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import robatortas.code.files.Renderer;

public class Painter extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private int width, height;
	
	private Driver driver;
	
	private JPanel panel;
	
	private Renderer renderer;
	
	public Painter(int width, int height, Driver driver) {
		this.driver = driver;
		this.width = width;
		this.height = height;
		this.renderer = new Renderer();
	}
	
	public ImageLoader imageLoader;
	private BufferedImage image;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g.create();
		
		image = driver.imageLoader.loadImageFromSource("/ducks.png");
		
		g2d.drawImage(image, 0, 0, width, height, null);
	}
	
	public JPanel getPanel() {
		return this.panel;
	}
}