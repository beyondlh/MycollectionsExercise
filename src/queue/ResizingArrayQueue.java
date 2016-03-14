package queue;

import java.util.Iterator;

public class ResizingArrayQueue<Item> implements QueueADT<Item>, Iterable<Item> {
	
	private int N;
	private final int INIT_CAPACITY = 1;
	private Item[] a;
	private int front;
	private int end;

	@SuppressWarnings("unchecked")
	public ResizingArrayQueue() {
		this.a = (Item[]) new Object[INIT_CAPACITY];
		this.N = 0;
		this.front = 0;
		this.end = 0;
	}
	public void enqueue(Item item) {
		if (N==a.length) {
			resize(N*2);
		}
		a[end++] = item;
		N++;
	}

	public Item dequeue() {
		if (this.isEmpty()){
			System.out.println("cannot dequeue from empty queue");
			throw new ArrayIndexOutOfBoundsException();
		}
		Item item = a[front];
		a[front] = null;
		front++;
		if (front == end){
			front = end = 0;
		}
		N--;
		return item;
	}

	public int size() {
		return N;
	}

	public boolean isEmpty() {
		if (a[front] == null) {
			return true;
		}
		return false;
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder();
		for (Item item: this.a) {
			if (item != null){
				s.append(item + ", ");
			}
		}
		return s.toString().substring(0, s.length()-2);
	}

	private void resize(int max) {
		@SuppressWarnings("unchecked")
		Item[] temp = (Item[]) new Object[max];
		for (int i=0; i<a.length; i++){
			temp[i] = a[i];
		}
		a = temp;
	}
	public Iterator<Item> iterator() {
		return (Iterator<Item>) new ListIterator<Item>();
	}
	
		@SuppressWarnings("hiding")
		private class ListIterator<Item> implements Iterator<Item> {
			private int i = front;

			public boolean hasNext() {
				if (i == end){
					return false;
				}
				return true;
			}

			@SuppressWarnings("unchecked")
			public Item next() {
				return (Item) a[i++];
			}

			public void remove() {
				// TODO Auto-generated method stub
				
			}
		}
}
