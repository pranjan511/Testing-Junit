package stack;

import java.util.Scanner;

public class StackManager {

	public static void main(String[] args) throws InvariantBroker {
		// TODO Auto-generated method stub
		        StackArray newStack = new StackArray(10);
		        System.out.println(" ~~~~ MY STACK (LIFO) ~~~~");
		        System.out.println(" PLEASE SELECT YOUR OPTION?");
	            System.out.println(" Enter 1: PUSH ELEMENT ");
	            System.out.println(" Enter 2: PULL ELEMENT ");
	            System.out.println(" Enter 3: GET HEAD OF MY STACK ");
	            System.out.println(" Enter 4: GET SIZE OF MY STACK ");
	            System.out.println(" Enter 5: GET NUMBER OF ELEMENTS ");
	            System.out.println(" Enter 6: IS MY STACK EMPTY?");
	            System.out.println(" Enter 7: IS MY STACK FULL?");
	            System.out.println(" Enter 8: IS MY STACK VARIANT?");
	            
	            //Options
	            @SuppressWarnings("resource")
				int n = new Scanner(System.in).nextInt();
	            
	            switch (n) {
				case 1:
					System.out.println("ENTER THE ELEMENT TO PUSH");
					int element = new Scanner(System.in).nextInt();
					newStack.push(element);
					break;
				case 2:
					System.out.println("ENTER Y TO CONFIRM PULL?");
					String request_pull = new Scanner(System.in).nextLine();
					if(request_pull.equalsIgnoreCase("Y")){
						newStack.push(1);
						newStack.push(2);
						newStack.push(3);
						newStack.pull();
					}
					break;
				case 3:
					System.out.println("ENTER Y TO CONFIRM HEAD?");
					String request_head = new Scanner(System.in).nextLine();
					if(request_head.equalsIgnoreCase("Y")){
						newStack.push(1);
						newStack.push(2);
						newStack.push(3);
						newStack.head();
					}
					break;
				case 4:
					System.out.println("ENTER Y TO KNOW SIZE OF MY STACK ");
					String request_size = new Scanner(System.in).nextLine();
					if(request_size.equalsIgnoreCase("Y")){
						newStack.push(1);
						newStack.push(2);
						newStack.push(3);
						newStack.getSize();
					}
					break;
				case 5:
					System.out.println("ENTER Y TO KNOW NUMBER OF ELEMENTS OF MY STACK ");
					String request_NoOfElements = new Scanner(System.in).nextLine();
					if(request_NoOfElements.equalsIgnoreCase("Y")){

						newStack.push(1);
						newStack.push(2);
						newStack.push(3);
						newStack.push(4);
						newStack.push(5);
						newStack.push(6);
						newStack.getNumElement();
					}
					break;
				
				case 6:
					System.out.println("ENTER Y TO KNOW IF MY STACK IS EMPTY. ");
					String request_IsEmpty = new Scanner(System.in).nextLine();
					if(request_IsEmpty.equalsIgnoreCase("Y")){
						newStack.isEmpty();
					}
					break;
				case 7:
					System.out.println("ENTER Y TO KNOW IF MY STACK IS FULL. ");
					String request_IsFULL = new Scanner(System.in).nextLine();
					if(request_IsFULL.equalsIgnoreCase("Y")){
						newStack.isFull();
					}
					break;
				case 8:
					System.out.println("ENTER Y TO KNOW IF MY STACK IS VARIANT. ");
					String request_IsVariant = new Scanner(System.in).nextLine();
					if(request_IsVariant.equalsIgnoreCase("Y")){
						newStack.isVariant();
					}
					break;
				default:
					System.out.println("YOUR CHOICE IS NOT ON THE LIST. TRY AGAIN.");
					System.exit(0);
					break;
				}
	}
}