/**
 * Prabhat RANJAN
 * Software Testing and Metrics
 * Telecom SudParis
 * 
 * */
package test;

import stack.StackArray;
import stack.InvariantBroker;
import org.junit.Before;
import org.junit.After;

public class TestStackArray extends TestStack 
{
	
	@Before
	public void Setup() throws InvariantBroker{
		stackInterface = new StackArray(10);	
	}
	
	@After
	public void Exit() throws InvariantBroker{
	stackInterface = null;
	}
}	