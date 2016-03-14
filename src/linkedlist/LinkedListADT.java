package linkedlist;

public interface LinkedListADT<Item> {
	//public LinkedList()
	public void add(Item item);
	public void addFront(Item item);
	public void append(Item item);
	public int indexOf(Item item);
	public int size();
	public boolean isEmpty();
	public int countOf(Item item);
	public void insert(Item item, int index);
	public Item remove(Item item);
	public Item removeAll(Item item);
	public Item removeIndex(int iindex);
	
}
