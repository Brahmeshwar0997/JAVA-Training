package list;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {
	private int size = 0;
	private int idx = 0;

	private static final int DEFAULT_CAPACITY = 10;
	private Object elements[];

	public MyArrayList() {
		elements = new Object[DEFAULT_CAPACITY];

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		int ele_length = 0;
		for (Object object : elements) {
			if (!(object == null)) {
				ele_length = ele_length + 1;
			}
		}

		return ele_length;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (elements.length == 0)
			return true;
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		for (Object object : elements) {
			if (o.equals(object)) {
				return true;
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Iterator<E> iterator() {
		return (Iterator<E>) new Iterator<E>() {

			public boolean hasNext() {
				return idx < elements.length && elements[idx] != null;
			}

			public E next() {
				return (E) elements[idx++];
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
	public boolean add(E e) {
		// TODO Auto-generated method stub
		if (size == elements.length) {
			increaseSize();
		}
		elements[size++] = e;
		return true;
	}

	private void increaseSize() {
		// TODO Auto-generated method stub
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

	

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		for (Object object : c) {
			for (Object object2 : elements) {
				if (!(object.equals(object2))) {
					return false;
				}
			}

		}
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		for (E e2 : c) {
			if (size == elements.length) {
				increaseSize();
			}
			elements[size++] = e2;
		}

		return true;
	}
	@Override
	public boolean remove(Object o) {
		if (contains(o) == true) {
			for (int i = 0; i < elements.length; i++) {
				if (elements[i] == o) {
					System.out.println("Before remove"+elements[i]);
					elements[i] = null;
					System.out.println("after remove"+elements[i]);
					break;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		for (Object object : c) {
			for (int i = 0; i < elements.length; i++) {
				if (elements[i] == object) {
					elements[i] = null;
					break;
				}
			}
			
		} 
		return true;

	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		elements = null;
	}

}
