package robatortas.code.files.core;

public class Logger {

	private static String sender = "[PROGRAM]: ";
	
	/**<NEWLINE>
	 * <b>log function in Logger class</b>
	 * <br><br>
	 * Logs a STRING to the console.
	 * 
	 * @param msg The message to be printed
	 */
	public static void log(String msg) {
		System.out.println(sender + msg);
	}
	/**<NEWLINE>
	 * <b>log function in Logger class</b>
	 * <br><br>
	 * Logs a FLOAT to the console.
	 * 
	 * @param msg The message to be printed
	 */
	public static void log(float msg) {
		System.out.println(sender + msg);
	}
	/**<NEWLINE>
	 * <b>log function in Logger class</b>
	 * <br><br>
	 * Logs a DOUBLE to the console.
	 * 
	 * @param msg The message to be printed
	 */
	public static void log(double msg) {
		System.out.println(sender + msg);
	}
	/**<NEWLINE>
	 * <b>log function in Logger class</b>
	 * <br><br>
	 * Logs a LONG to the console.
	 * 
	 * @param msg The message to be printed
	 */
	public static void log(long msg) {
		System.out.println(sender + msg);
	}
	/**<NEWLINE>
	 * <b>log function in Logger class</b>
	 * <br><br>
	 * Logs an INT to the console.
	 * 
	 * @param msg The message to be printed
	 */
	public static void log(int msg) {
		System.out.println(sender + msg);
	}
	/**<NEWLINE>
	 * <b>log function in Logger class</b>
	 * <br><br>
	 * Logs a BYTE to the console.
	 * 
	 * @param msg The message to be printed
	 */
	public static void log(byte msg) {
		System.out.println(sender + msg);
	}
	/**<NEWLINE>
	 * <b>log function in Logger class</b>
	 * <br><br>
	 * Logs a BOOLEAN to the console.
	 * 
	 * @param msg The message to be printed
	 */
	public static void log(boolean msg) {
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