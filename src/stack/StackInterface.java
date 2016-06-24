/**
 * Prabhat RANJAN
 * Software Testing and Metrics
 * Telecom SudParis
 * 
 * */
package stack;


public interface StackInterface {
public boolean isVariant=false;
public int getSize();
public int getNumElement();
public void push(int x) throws InvariantBroker;
public void pull() throws InvariantBroker;
public Boolean isFull();
public boolean isEmpty();
public int head() throws InvariantBroker;
public Boolean isVariant() throws InvariantBroker;

}
