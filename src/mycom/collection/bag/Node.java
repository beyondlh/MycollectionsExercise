package mycom.collection.bag;

public class Node<Item> {
	private Item item;
	private Node<Item> next;
	
	public Node(){
		this.item = null;
		this.next = null;
	}
	
	public Node(Item item) {
		this.item = item;
		this.next = null;
	}
	
	//getters
	public Item getItem() {return this.item;}
	public Node<Item> getNext() {return this.next;}
	
	//setters
	public void setItem(Item item){this.item = item;}
	public void setNext(Node<Item> next){this.next = next;}

}
