package robatortas.code.files;

/**<NEWLINE>
 * <b>MainApp class</b>
 * <br><br>
 * Program made for iamge processing tests for the YURI ENGINE.
 * <br><br>
 * If you are using this code, please know how it works first!
 * 
 * <br><br>
 * Prolusio Interactive Software
 * 
 * @author Prolusio Interactive
 *
 */
public class MainApp {

	static String title = "Image Processor";
	static int width = 720;
	static int height = 520;
	
	public static void main(String[] args) {
		Logger.log("Starting Program...");
		new Display(width, height, title);
	}
}