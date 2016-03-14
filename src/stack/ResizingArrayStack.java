package stack;

import java.util.Iterator;


public class ResizingArrayStack<Item> implements StackADT<Item>, Iterable<Item> {
	private int N;
	private Item[] a;
	private final int INIT_CAPACITY = 1;
	
	@SuppressWarnings("unchecked")
	public ResizingArrayStack() { 
		this.N = 0;
		this.a = (Item[]) new Object[INIT_CAPACITY];
	}

	public void push(Item item) {
		/*try {
			if (item == null) {
				throw new UnsupportedOperationException("cannot resolve value on null");
			}
			}
			catch (UnsupportedOperationException e){
				Option op = new None();
				item = (Item) op;
			}
			*/
		if (N==a.length){
			resize(N*2);
		}
		a[N++] = item;
	}

	public Item pop() {
		if (this.isEmpty() == true) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Item item = a[--N];
		a[N] = null;
		if (N>0 && N==a.length/4) {
			resize(a.length/2);
		}
		return item;
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
	
	private void resize(int max) {
		try {
			System.out.println("Resizing");
			@SuppressWarnings("unchecked")
			Item[] temp = (Item[]) new Object[max];
			for (int i=0; i<a.length; i++){
				if (a[i] == null){
					break;
				}
				System.out.println("a[i]= " + a[i]);
				temp[i] = a[i];
			}
			a = temp;
			}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("abort" + e.getMessage());
		}
	}

	public Iterator<Item> iterator() {
		return (Iterator<Item>) new reverseIterator<Item>();
	}
	
		@SuppressWarnings("hiding")
		private class reverseIterator<Item> implements Iterator<Item>{
			private int i=N;
			
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
