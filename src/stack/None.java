package stack;

public class None<T> implements Option<T> {
	
	public None(){}
	public T get(){
		throw new UnsupportedOperationException("cannot resolve value on null"); 
	}
}
