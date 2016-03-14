package stack;

import java.util.Iterator;

public class LinkedStack<Item> implements StackADT<Item>, Iterable<Item> {
	
	private Node<Item> first;
	private int N;
	
	public LinkedStack() {
		this.first = null;
		this.N = 0;
	}
	
	public void push(Item item) {
		Node<Item> newNode = new Node<Item>(item);
		if (isEmpty()) {
			first = newNode;
		}
		else {
			newNode.setNext(first);
			first = newNode;
		}
		N++;
	}

	public Item pop() {
		if (isEmpty()) {
			System.out.println("cannot pop from empty stack"); 
			throw new NullPointerException();
		}
		Item item = first.getItem();
		first = first.getNext();
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
		return (Iterator<Item>) new linkedIterator<Item>();
	}
		
		@SuppressWarnings("hiding")
		private class linkedIterator<Item> implements Iterator<Item> {
			@SuppressWarnings("unchecked")
			Node<Item> n = (Node<Item>) first;
			
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
