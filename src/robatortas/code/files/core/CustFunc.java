package robatortas.code.files.core;

/**<NEWLINE>
 * <b>CustFunc class</b>
 * <br><br>
 * To create custom functions in function parameters
 * 
 * 
 * @see FunctionalInterface
 */
@FunctionalInterface
public interface CustFunc<T> {
	public <T> void func();
}
