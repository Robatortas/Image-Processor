package robatortas.code.files.core;

/**<NEWLINE>
 * <b>PixelEditor class</b>
 * <br><br>
 * Name sounds hella confusing, but it's just the class where
 * <br>
 * we'll be editing our image pixels!
 */
public class PixelEditor {
	
	ImageLoader imageLoader = new ImageLoader();
	
	/**<NEWLINE>
	* <b>looper function in PixelEditor class</b>
	* <br><br>
	* To loop through the pixels array.
	* 
	* @param function Generic Function that iterates through the x & y loop.
	* 
	* @see CustFunc
	*/
	public void looper(CustFunc function) {
		for(int y = 0; y < imageLoader.getHeight(); y++) {
			for(int x = 0; x < imageLoader.getWidth(); x++) {
				function.func();
			}
		}
	}
}