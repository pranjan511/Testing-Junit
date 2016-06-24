/**
 * Prabhat RANJAN
 * Software Testing and Metrics
 * Telecom SudParis
 * 
 * */
package test;

import org.junit.After;
import org.junit.Before;
import queue.QueueLinkedList;
import stack.InvariantBroker;

public class TestQueueLinkedList extends TestStack
{

	@Before
	public void Setup() throws InvariantBroker{
		stackInterface = new QueueLinkedList();
	}
	@After
	public void Exit() throws InvariantBroker{
		stackInterface = null;
	}
}
