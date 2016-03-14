import java.util.Arrays;
import java.util.List;

import mycom.collection.bag.Bag;

import queue.LinkedQueue;
import queue.ResizingArrayQueue;

import stack.ResizingArrayStack;


public class Main {
	public static void main (String[] args) {
		Bag<String> bag = new Bag<String>();
		bag.add("a");
		bag.add("x");
		bag.add("z");
		bag.add("t");
		bag.add("e");
		bag.add("u");
		for (String s: bag) {
			System.out.println(s);
		}
	}
	
	public void testLinkedQueue() {
		LinkedQueue<String> queue = new LinkedQueue<String>();
		queue.enqueue("a");
		queue.enqueue("b");
		queue.enqueue("c");
		queue.enqueue("d");
		for (String s: queue) {
			System.out.println(s);
		}
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		for (String s: queue) {
			System.out.println(s);
		}
		queue.dequeue();
		queue.enqueue("a");
		queue.enqueue("b");
		queue.enqueue("c");
		queue.enqueue("d");
		for (String s: queue) {
			System.out.println(s);
		}
	}
	
	public void testQueue() {
		ResizingArrayQueue<String> queue = new ResizingArrayQueue<String>();
		System.out.println("enqueue a");
		queue.enqueue("a");
		System.out.println("enqueue b");
		queue.enqueue("b");
		System.out.println("enqueue c");
		queue.enqueue("c");
		System.out.println("dequeue");
		queue.dequeue();
		System.out.println("dequeue");
		queue.dequeue();
		System.out.println("dequeue");
		queue.dequeue();
		System.out.println("enqueue d");
		queue.enqueue("d");
		System.out.println("enqueue e");
		queue.enqueue("e");
		System.out.println("enqueue f");
		queue.enqueue("f");
		System.out.println("dequeue");
		queue.dequeue();
		System.out.println("dequeue");
		queue.dequeue();
		System.out.println("dequeue");
		queue.dequeue();
		System.out.println("enqueue a");
		queue.enqueue("a");
		queue.dequeue();
		System.out.println("enqueue a");
		queue.enqueue("a");
		System.out.println("enqueue b");
		queue.enqueue("b");
		System.out.println("enqueue c");
		queue.enqueue("c");
		System.out.println("enqueue d");
		queue.enqueue("d");
		System.out.println("enqueue e");
		queue.enqueue("e");
		System.out.println("dequeue");
		queue.dequeue();
		for (String s: queue) {
			System.out.println(s);
		}
		System.out.println("toString");
		String s = queue.toString();
		List<String> items = Arrays.asList(s.split(", "));
		System.out.println(items);
	}
	public void testStack() {
		ResizingArrayStack<String> stack = new ResizingArrayStack<String>();
		System.out.println(stack.size());
		System.out.println("pushing a");
		stack.push("a");
		System.out.println(stack.size());
		System.out.println("pushing b");
		stack.push("b");
		System.out.println(stack.size());
		System.out.println("pushing c");
		stack.push("c");
		System.out.println(stack.size());
		System.out.println("pushing d");
		stack.push("d");
		System.out.println(stack.size());
		System.out.println("pushing e");
		stack.push("e");
		System.out.println(stack.size());
		System.out.println("pushing f");
		stack.push("f");
		System.out.println(stack.size());
		System.out.println("pushing g");
		stack.push("g");
		System.out.println(stack.size());
		System.out.println("pushing h");
		stack.push("h");
		System.out.println(stack.size());
		System.out.println("pushing i");
		stack.push("i");
		System.out.println(stack.size());
		for (String s: stack){
			System.out.println(s);
		}
		String item;
		System.out.println("pop");
		item = stack.pop();
		System.out.println(item);
		System.out.println("pop");
		item = stack.pop();
		System.out.println(item);
		System.out.println("pop");
		item = stack.pop();
		System.out.println(item);
		System.out.println("pop");
		item = stack.pop();
		System.out.println(item);
		System.out.println("pop");
		item = stack.pop();
		System.out.println(item);
		System.out.println("pop");
		item = stack.pop();
		System.out.println(item);
		System.out.println("pop");
		item = stack.pop();
		System.out.println(item);
		System.out.println("pop");
		item = stack.pop();
		System.out.println(item);
		System.out.println("pop");
		item = stack.pop();
		System.out.println(item);
		System.out.println("pop");
		item = stack.pop();
		System.out.println(item);
	}
}
