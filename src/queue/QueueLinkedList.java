/**
 * Prabhat RANJAN
 * Software Testing and Metrics
 * Telecom SudParis
 * 
 * */
package queue;
import java.util.LinkedList;

import stack.*;
public class QueueLinkedList implements StackInterface
{
	LinkedList<Integer> Queue;
	public static int top;
	public QueueLinkedList(){
		super();
		Queue= new LinkedList<Integer>();
		top=0;
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return Queue.size();
	}

	@Override
	public int getNumElement() {
		// TODO Auto-generated method stub
		return top;
	}

	@Override
	public void push(int x) throws InvariantBroker {
		// TODO Auto-generated method stub
		Queue.add(x);
		++top;
	}

	@Override
	public void pull() throws InvariantBroker {
		// TODO Auto-generated method stub
		if (top==0){
			throw new InvariantBroker("Stack can't be negative.");	
		}
		else
		{
			Queue.removeFirst();
			--top;
		}
	}

	@Override
	public Boolean isFull() {
		// TODO Auto-generated method stub
		if(Queue.size()==top)
		{
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(QueueLinkedList.top==0)
		{
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public int head() throws InvariantBroker {
		// TODO Auto-generated method stub
		return Queue.getFirst();
	}

	@Override
	public Boolean isVariant() throws InvariantBroker {
		// TODO Auto-generated method stub
		try{
			return !isVariant;
		}
		catch (Throwable t){
			return isVariant;	
		}
	}
	public static void main(String []args){
	} 
}
