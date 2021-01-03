package list;

import java.util.Collection;
import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E> {
	private static int counter;
	private MyNode head;

	private static class MyNode<E> {
		MyNode next;
		Object data;

		public MyNode(Object data) {
			this.next = null;
			this.data = data;
		}

		@SuppressWarnings("unused")
		public MyNode(Object dataValue, MyNode nextValue) {
			next = nextValue;
			data = dataValue;
		}

		public Object getData() {
			return data;
		}

		@SuppressWarnings("unused")
		public void setData(Object dataValue) {
			data = dataValue;
		}

		public MyNode getNext() {
			return next;
		}

		public void setNext(MyNode nextValue) {
			next = nextValue;
		}

	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		if (head == null) {
			head = new MyNode(e);
		}
		MyNode newNode = new MyNode(e);
		MyNode currentNode = head;
		if (currentNode != null) {
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(newNode);
		}
		incrementCounter();
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	private static int getCounter() {
		return counter;
	}

	private static void incrementCounter() {
		counter++;
	}

	private void decrementCounter() {
		counter--;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return getCounter();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (getCounter() <= 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		MyNode<E> start = head;
		while (start.getNext() != null) {
			if (start.getData() == o) {
				return true;
			}
			start = start.getNext();
		}

		return false;
	}

	@Override
	public Iterator<E> iterator() {
		MyNode<E> start = head;
		// TODO Auto-generated method stub
		return (Iterator<E>) new Iterator<E>() {

			public boolean hasNext() {

				return start.getNext() != null;
			}

			public E next() {
				return (E) start.getData();
			}
		};
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		MyNode<E> start = head;
		while (start.getNext() != null) {
			if (start.getData() == o) {
				start.setNext(start.getNext().getNext());
				return true;
			}
			start = start.getNext();
		}

 		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

}
