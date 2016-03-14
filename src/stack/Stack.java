package stack;

//a stack
import java.util.Iterator;

public class Stack<Item> implements StackADT<Item>, Iterable<Item> {
	private int N;
	private Item[] a;
	private final int INIT_CAPACITY = 1;
	
	@SuppressWarnings("unchecked")
	public Stack(){ 
		this.N = 0;
		this.a = (Item[]) new Object[INIT_CAPACITY];
	}

	public void push(Item item) {
		a[N++] = item;
	}

	public Item pop() {
		return a[--N];
	}

	public int size() {
		return N;
	}

	public boolean isEmpty() {
		if (N==0) {
			return true;
		}
		return false;
	}

	public Iterator<Item> iterator() {
		return (Iterator<Item>) new reverseIterator<Item>();
	}
	
		@SuppressWarnings("hiding")
		private class reverseIterator<Item> implements Iterator<Item>{
			private int i=N;
			private int j=0;
			
			public boolean hasNext() {
				if (i>0){
					return true;
				}
				return false;
			}

			@SuppressWarnings("unchecked")
			public Item next() {
				return (Item) a[--i];
			}

			public void remove() {
				return;
			}		
		}
}
