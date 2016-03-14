package stack;

public interface StackADT<Item> { 
	//public Stack()
	public void push(Item item);
	public Item pop();
	public int size();
	public boolean isEmpty();
	public String toString();

}
