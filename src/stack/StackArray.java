/**
 * Prabhat RANJAN
 * Software Testing and Metrics
 * Telecom SudParis
 * 
 * */
package stack;

import java.util.Arrays;

public class StackArray implements StackInterface {
	
	public static int top;
	public int[] stack;
	public boolean isVariant;
	
	public StackArray(int size) throws InvariantBroker{
		if(size<=0) 
		{
		throw new InvariantBroker("Stack must be non-negative and non-zero");
		}
		else
		{
			stack= new int[size];
			top=-1;
		}
	}
	
	public int getSize(){ //returns the size of the stack
		return stack.length;
	}
	
	public int getNumElement(){ //returns the no. of element of the stack
		return top;
		}
	
	public void push(int x) throws InvariantBroker { //inserts the element into stack
		if(isFull()){
            throw new InvariantBroker("stack is full");
        }
        else
        {
        	stack[++top] = x;
        	//System.out.println("Pushed "+x);
        }
		//for(int i=0;i<top;i++){
			//System.out.print(stack[i]+" ");
		//}
	}
	
	public void pull() throws InvariantBroker{ //removes the upper element of the stack
	        if(isEmpty()){
	          	throw new InvariantBroker("Can't pop.stack is empty");
	      	}
	        else
	        	{
	        	--top;
	        	}
	    }

	public Boolean isFull(){ //returns true if stack is full		
		return top == stack.length-1;
	}
	
	public boolean isEmpty(){
        if(top==-1){
			return true;
        }
        else{
        	return false;
        }
    }
	
	public int head() throws InvariantBroker { //returns the upper element of the stack
		if(isEmpty()){
		throw new InvariantBroker("Stack is empty");
		}
		return stack[top];
	}
	
	public Boolean isVariant() throws InvariantBroker{ //return true if the properties are true
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
			return "Stack [top=" + top + ", stack=" + Arrays.toString(stack) + ", isVariant=" + isVariant
					+ ", getNumElement()=" + getNumElement() + ", getSize()=" + getSize() + ", isFull()=" + isFull()
					+ ", isEmpty()=" + isEmpty() + ", head()=" + head() + ", isVariant()=" + isVariant() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		} catch (InvariantBroker e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void main (String []args) throws InvariantBroker{
	}

}