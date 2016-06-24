/**
 * Prabhat RANJAN
 * Software Testing and Metrics
 * Telecom SudParis
 * 
 * */
package stack;

@SuppressWarnings("serial")
public class InvariantBroker extends Exception
{
public InvariantBroker(String ExceptionMsg){
	super(ExceptionMsg);
	System.out.println(ExceptionMsg);
}
}
