package robatortas.code.files;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {
	
	public JFrame frame = new JFrame();
	
	/**<NEWLINE>
	 * <b>Display method in Display class</b>
	 * <br><br>
	 * To create a new window.
	 * 
	 */
	Renderer renderer = new Renderer();
	
	public Display(int width, int height, String title) {
		
		Dimension size = new Dimension(width, height);
		
		frame.setTitle(title);
		frame.setSize(size);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		renderer.render();
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}