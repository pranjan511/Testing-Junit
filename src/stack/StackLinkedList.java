/**
 * Prabhat RANJAN
 * Software Testing and Metrics
 * Telecom SudParis
 * 
 * */
package stack;

import java.util.LinkedList;

public class StackLinkedList implements StackInterface
{
	public static int top;
	public boolean isVariant;
	LinkedList<Integer> stackList;
	
	public StackLinkedList(){
	stackList=new LinkedList<Integer>();
	top=0;
	}
	
	@Override
	public int getSize() {
		//get size of the LinkedList
		stackList.size();
		return stackList.size();
	}

	@Override
	public int getNumElement() {
	// get the number of Elements present in LinkedList
		return top;	
	}

	@Override
	public void push(int x) throws InvariantBroker {
		// Push the element in stack
		stackList.add(x);
		++top;
	}

	@Override
	public void pull() throws InvariantBroker {
		// TODO Auto-generated method stub
		if (top==0){
			top=0;
			throw new InvariantBroker("Stack can't be negative.");	
		}
		else
		{
			stackList.removeLast();
			--top;
		}
	}

	@Override
	public Boolean isFull() {
		// Checks if stack is full or not
		if(stackList.size()==top)
		{
			return true;
		}
		else{
			return false;
		}
			
	}

	@Override
	public boolean isEmpty() {
		// Checks if stack is empty or not
		if(StackLinkedList.top==0)
		{
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public int head() throws InvariantBroker {
		// returns the upper element of the stack 
		return stackList.getLast();
	}

	@Override
	public Boolean isVariant() throws InvariantBroker {
		// returns true if isVariant
		try{
			return !isVariant;
		}
		catch (Throwable t){
			System.out.println("Throwable");
			return isVariant;	
		}
	}

	@Override
	public String toString() {
		try {
			return "StackLinkedList [top=" + top + ", isVariant=" + isVariant + ", stackList=" + stackList + ", getSize()="
					+ getSize() + ", getNumElement()=" + getNumElement() + ", isFull()=" + isFull() + ", isEmpty()="
					+ isEmpty() + ", head()=" + head() + ", isVariant()=" + isVariant() + "]";
		} catch (InvariantBroker e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String []args) throws InvariantBroker{
	}
}