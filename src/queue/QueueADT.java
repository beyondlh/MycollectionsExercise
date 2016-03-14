package queue;

public interface QueueADT<Item> {
	public void enqueue(Item item);
	public Item dequeue();
	public int size();
	public boolean isEmpty();
	public String toString();
}
