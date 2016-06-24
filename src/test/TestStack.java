/**
 * Prabhat RANJAN
 * Software Testing and Metrics
 * Telecom SudParis
 * 
 * */
package test;

import static org.junit.Assert.*;
import org.junit.Test;
import queue.QueueLinkedList;
import stack.InvariantBroker;
import stack.StackArray;
import stack.StackInterface;
import stack.StackLinkedList;

public abstract class TestStack {
	public int x=10;
	public StackInterface stackInterface;
	
	@Test
	public void test_getSize(){
	if(stackInterface instanceof StackArray){
		assertEquals(stackInterface.getSize(), 10 );
	}
	else
	{
		assertEquals(stackInterface.getSize(),0);
	}
	}
	
	@Test
	public void test_getNumElement(){
	if(stackInterface instanceof StackArray)
		{
		assertEquals(StackArray.top, -1);
		}
	else{
		assertEquals(StackLinkedList.top, 0);	
	}
	
	}

	@Test
	public void test_push() throws InvariantBroker
	{	
		int y= stackInterface.getNumElement();
		stackInterface.push(10);
		if(stackInterface instanceof StackArray)
		{	
			if(stackInterface.getSize()==StackArray.top)
			{
			assertEquals(stackInterface.getNumElement(),y);
			}
		else{
			assertEquals(stackInterface.getNumElement(),y+1);	
			}
		}
		else if(stackInterface instanceof StackLinkedList)
		{
		assertEquals(StackLinkedList.top,y+1);
		}
		else
		{
			assertEquals(QueueLinkedList.top,y+1);
		}
	}
	
	@Test
	public void test_pull() throws InvariantBroker
	{	
		int y=stackInterface.getNumElement();
		stackInterface.push(10);
		stackInterface.pull();
		if(stackInterface instanceof StackArray)
		{
			if(StackArray.top-1==0)
			{	
				assertEquals(StackArray.top, -1);
			}
			else
			{
				assertEquals(StackArray.top, y );
			}
		}
		else
		{
			if(stackInterface.getNumElement()==0)
			{
				assertEquals(StackLinkedList.top, 0);
			}
			else
			{
				assertEquals(StackLinkedList.top, y+1);
			}
		}
	}
	
	@Test
	public void test_isFull(){	
	if(stackInterface.getSize()==stackInterface.getNumElement())
	{
		assertTrue(stackInterface.isFull());
	}
	else
	{
		assertFalse(stackInterface.isFull());
	}
	}
	
	@Test
	public void test_isEmpty()
	{	
		if(stackInterface instanceof StackArray){
			if(StackArray.top==-1){
				assertTrue(stackInterface.isEmpty());
			}
			else
			{
			assertFalse(stackInterface.isEmpty());
			}
		}
		else {
			if (StackLinkedList.top==0){
				assertTrue(stackInterface.isEmpty());
			}
			else
			{
				assertFalse(stackInterface.isEmpty());
			}
		}
	}
	@Test
	public void test_head() throws InvariantBroker{	
		stackInterface.push(10);
		if(stackInterface instanceof StackLinkedList)
		{
			
			assertEquals(stackInterface.head(),10);
		}
	else
		{
			assertEquals(stackInterface.head(),10);
		}
	}
	@Test
	public void test_isVariant() throws InvariantBroker{	
	assertTrue(stackInterface.isVariant());
	}
}