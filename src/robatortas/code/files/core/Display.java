package robatortas.code.files.core;

import java.awt.Dimension;

import javax.swing.JFrame;

/**<NEWLINE>
 * <b>Display class</b>
 * <br><br>
 * Class to manage the window (Display)
 */
public class Display {
	
	public JFrame frame = new JFrame();
	
	/**<NEWLINE>
	 * <b>Display method in Display class</b>
	 * <br><br>
	 * To create a new window.
	 * 
	 * @param width The width of the window.
	 * @param height The height of the window.
	 * @param title The title of the window.
	 * @param driver The Driver class.
	 * 
	 * @see Driver
	 */
	public Display(int width, int height, String title, Driver driver) {
		
		Dimension size = new Dimension(width, height);
		
		frame.setTitle(title);
		frame.setSize(size);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(driver);
		frame.add(driver.getPainter());
		driver.start();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}