package stack;

//import java.util.Scanner;

public class StackLinkedListManager {

	public static void main(String[] args) throws InvariantBroker {
		// TODO Auto-generated method stub
					    StackLinkedList newStack = new StackLinkedList();
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
			            /*@SuppressWarnings("resource")
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
								System.out.println(newStack.head());
							}
							break;
						case 4:
							System.out.println("ENTER Y TO KNOW SIZE OF MY STACK ");
							String request_size = new Scanner(System.in).nextLine();
							if(request_size.equalsIgnoreCase("Y")){
								newStack.push(1);
								newStack.push(2);
								newStack.push(3);
								System.out.println(newStack.getSize());
							}
							break;
						case 5:
							System.out.println("ENTER Y TO KNOW NUMBER OF ELEMENTS OF MY STACK ");
							String request_NoOfElements = new Scanner(System.in).nextLine();
							if(request_NoOfElements.equalsIgnoreCase("Y")){
								System.out.println(newStack.getNumElement());
							}
							break;
						
						case 6:
							System.out.println("ENTER Y TO KNOW IF MY STACK IS EMPTY. ");
							String request_IsEmpty = new Scanner(System.in).nextLine();
							if(request_IsEmpty.equalsIgnoreCase("Y")){
								System.out.println(newStack.isEmpty());
							}
							break;
						case 7:
							System.out.println("ENTER Y TO KNOW IF MY STACK IS FULL. ");
							String request_IsFULL = new Scanner(System.in).nextLine();
							if(request_IsFULL.equalsIgnoreCase("Y")){
								System.out.println(newStack.isFull());
							}
							break;
						case 8:
							System.out.println("ENTER Y TO KNOW IF MY STACK IS VARIANT. ");
							String request_IsVariant = new Scanner(System.in).nextLine();
							if(request_IsVariant.equalsIgnoreCase("Y")){
								System.out.println(newStack.isVariant());
							}
							break;
						default:
							System.out.println("YOUR CHOICE IS NOT ON THE LIST. TRY AGAIN.");
							System.exit(0);
							break;
							}*/
			            newStack.push(1);
			            newStack.push(1);
						newStack.push(2);
						newStack.push(3);
						newStack.pull();
						System.out.println(newStack.head());
						newStack.push(1);
						newStack.push(2);
						newStack.push(3);
						System.out.println(newStack.getSize());
						System.out.println(newStack.getNumElement());
						System.out.println(newStack.isEmpty());
						System.out.println(newStack.isFull());
						System.out.println(newStack.isVariant());
			}
}