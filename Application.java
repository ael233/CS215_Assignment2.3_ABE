/**
 * An application class that implements a queue for the VegeBurger Palace restaurant.
 * @author aelias
 */

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		/**
		 * Instantiates the VegeLine using the Queue class.
		 */
		Queue VegeLine = new Queue<>();
		
		/**
		 * Defaults the actionInput user input to 0.
		 */
		int actionInput = 0;
		
		/**
		 * Instantiates a queued person variable to be added to the line.
		 */
		String queuedPerson = "";
				
		/**
		 * Creates a new scanner object.
		 */
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Asks the user for input and assigns that input to actionInput, which determines whether the subsequent while loop is triggered.
		 */
		System.out.println("Enter 0 to add a person to the queue.  Enter 1 to serve and dequeue a person.  Enter 9 to stop.");
		actionInput = sc.nextInt();
		sc.nextLine();
		
		while(actionInput != 9) {
		/**
		 * If the user inputs 0, they can add a person to the queue.  The program prints that the person has been added to the queue, and then the entire queue is printed.
		 */
			if(actionInput == 0) {
				System.out.println("Enter a person to add to the queue: ");
				queuedPerson = sc.nextLine();
				System.out.println("Adding " + queuedPerson + " to the line.");
				VegeLine.enqueue(queuedPerson);
				VegeLine.printQueue();
				System.out.println("Enter 0 to add a person to the queue.  Enter 1 to serve and dequeue a person.  Enter 9 to stop.");
				actionInput = sc.nextInt();
				sc.nextLine();
			}//end add to queue
		
			/**
			 * If the user inputs 1, the person in the front of the line is served and dequeued.  The queue is then printed.
			 */
			if(actionInput == 1) {
				if(!VegeLine.isEmpty()) {
					String servedPerson = VegeLine.dequeue().toString();
					System.out.println(servedPerson + " has been served.");
					VegeLine.printQueue();
					
			/**
			 * If the user input asks to serve a person but the queue is empty, the console prints that the queue is empty.
			 */
				}else {
					System.out.println("The queue is empty.  There is no one to serve.");
				}
				System.out.println("Enter 0 to add a person to the queue.  Enter 1 to serve and dequeue a person.  Enter 9 to stop.");
				actionInput = sc.nextInt();
				sc.nextLine();
			}//end dequeue
		}//end while loop	
		
	}//end main

}//end class
