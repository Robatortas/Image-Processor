package robatortas.code.files.core;

public class Logger {

	private static String sender = "[PROGRAM]: ";
	
	/**<NEWLINE>
	 * <b>log function in Logger class</b>
	 * <br><br>
	 * Logs a message to the console.
	 * 
	 * @param msg The message to be printed
	 */
	public static void log(String msg) {
		System.out.println(sender + msg);
	}
	
	/**<NEWLINE>
	 * <b>logError function in Logger class</b>
	 * <br><br>
	 * Logs an error to the console.
	 * 
	 * @param err The error to be printed
	 */
	public static void logError(String err) {
		System.err.println(sender + err);
	}
	
	/**<NEWLINE>
	 * <b>logJVMError function in Logger class</b>
	 * <br><br>
	 * Logs aa JVM (Java-Virtual-Machine) error to the console.
	 * 
	 * @param e The exception given by the try/catch
	 */
	public static void logJVMError(Exception e) {
		logError("[JVM]: " + e.getMessage());
	}
}