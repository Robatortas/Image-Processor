package robatortas.code.files;

public class Logger {

	public String sender = "[PROGRAM]:";
	
	/**<NEWLINE>
	 * <b>log function in Logger class</b>
	 */
	public void log(String msg) {
		System.out.println(sender + msg);
	}
	
	public void logError(String msg) {
		System.err.println(sender + msg);
	}
	
	public void logJVMError(Exception e) {
		log(e.getMessage());	
	}
}