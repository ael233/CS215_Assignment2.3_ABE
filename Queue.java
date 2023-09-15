/**
 * A class that implements a queue data structure using a linked list.
 * @author aelias
 */
import java.util.NoSuchElementException;

public class Queue<T> {
	/**
	 * A new list of type LinkedList is instantiated.
	 */
	private LinkedList<T> list;
	
	public Queue() {
		list = new LinkedList<>();
	}//end empty-argument constructor
	
	/**
	 * Enqueue; adds a new entry to the queue.
	 * @param newEntry
	 */
	public void enqueue(T newEntry) {
		Node<T> newNode = new Node<>();
		newNode.setData(newEntry);
		list.addNode(newNode);
		System.out.println(newEntry + " has arrived.");
	}//end enqueue
	
	/**
	 * Dequeue; removes the front entry from the queue and sets the next entry as the front entry in the queue.
	 * @return Returns the entry dequeued.
	 */
	public T dequeue() {
		if(list.isEmpty()) {
			throw new NoSuchElementException("Nothing in the queue");
		}//end if
		Node<T> frontNode = list.getList();
		list.head = frontNode.nextNode;
		list.length--;
		return frontNode.getData();
	}//end dequeue
	
	/**
	 * Tests whether the queue is empty or not.
	 * @return Returns true if the queue is empty, false if not.
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}//end isEmpty
	
	/**
	 * Prints all entries in the queue.
	 */
	public void printQueue() {
		Node<T> currentNode = list.getList();
		StringBuilder queueContents = new StringBuilder("The queue contains: ");
		
		while (currentNode != null) {
			queueContents.append(currentNode.getData());
			if(currentNode.nextNode != null) {
				queueContents.append(", ");
			}
			
			currentNode = currentNode.nextNode;
		}//end while loop
		System.out.println(queueContents.toString());
	}//end printQueue
	
}//end class
