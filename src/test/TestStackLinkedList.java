/**
 * Prabhat RANJAN
 * Software Testing and Metrics
 * Telecom SudParis
 * 
 * */

package test;

import org.junit.After;
import org.junit.Before;

import stack.InvariantBroker;
import stack.StackLinkedList;

public class TestStackLinkedList extends TestStack{
	
@Before
public void Setup() throws InvariantBroker{
	stackInterface = new StackLinkedList();
}
@After
public void Exit() throws InvariantBroker{
	stackInterface = null;
}
}
