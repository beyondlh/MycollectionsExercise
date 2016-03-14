package mycom.collection.bag;

public interface BagADT<Item> {
	//public Bag()
	public void add(Item item);
	public int size();
	public boolean isEmpty();
	public String toString();
}
