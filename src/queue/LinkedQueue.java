package queue;

import java.util.Iterator;

public class LinkedQueue<Item> implements QueueADT<Item>, Iterable<Item> {
	
	private Node<Item> first;
	private Node<Item> last;
	private int N;
	
	public LinkedQueue() {
		this.first = null;
		this.last = null;
	}

	public void enqueue(Item item) {
		Node<Item> newNode = new Node<Item>(item);
		if (isEmpty()) {
			first = last = newNode;
		}
		else {
			last.setNext(newNode);
			last = last.getNext();
		}
		N++;
	}

	public Item dequeue() {
		if (isEmpty()) {
			throw new NullPointerException();
		}
		Item item = first.getItem();
		if (size() == 1) {
			first = last = null;
		}
		else {
			first = first.getNext();
		}
		N--;
		return item;
	}

	public int size() {
		return N;
	}

	public boolean isEmpty() {
		if (first == null) {
			return true;
		}
		return false;
	}

	public Iterator<Item> iterator() {
		return (Iterator<Item>) new LinkedIterator<Item>();
	}
		
		private class LinkedIterator<Item> implements Iterator<Item> {
			
			private Node<Item> n = (Node<Item>) first;
			
			public boolean hasNext() {
				if (n == null) {
					return false;
				}
				return true;
			}

			public Item next() {
				Item item = n.getItem();
				n = n.getNext();
				return item;
			}

			public void remove() {
				return;
				
			}
			
		}
	
}
