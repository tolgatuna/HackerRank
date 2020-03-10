package baeldung;

import java.util.*;

public class CustomList<E> implements List<E> {
    private Object[] internal = {};

    @Override
    public int size() {
        return internal.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object internalObject : internal) {
            if (internalObject.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyCustomIterator();
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(internal, size());
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size())
            // Make a new array of a's runtime type, but my contents:
            return (T[]) Arrays.copyOf(internal, size(), a.getClass());
        System.arraycopy(internal, 0, a, 0, size());
        if (a.length > size())
            a[size()] = null;
        return a;
    }

    @Override
    public boolean add(E e) {
        Object[] temp = Arrays.copyOf(internal, size() + 1);
        temp[size()] = e;
        internal = temp;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Unsupported Operation for remove with value!");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object item : c) {
            if (!contains(item)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Unsupported Operation for addAll!");
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Unsupported Operation for addAll!");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Unsupported Operation for removeAll!");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Unsupported Operation for retainAll!");
    }

    @Override
    public void clear() {
        internal = new Object[]{};
    }

    @Override
    public E get(int index) {
        return (E) internal[index];
    }

    @Override
    public E set(int index, E element) {
        E oldElement = get(index);
        internal[index] = element;
        return oldElement;
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("Unsupported Operation for add!");
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Unsupported Operation for remove!");
    }

    @Override
    public int indexOf(Object o) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (internal[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int size = size();
        for (int i = size - 1; i > -1; i--) {
            if (internal[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        E[] temp = (E[]) new Object[toIndex - fromIndex];
        for (int i = fromIndex; i < toIndex; i++) {
            temp[i - fromIndex] = get(i);
        }
        return Arrays.asList(temp);
    }

    private class MyCustomIterator implements Iterator<E> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index != size();
        }

        @Override
        public E next() {
            return get(index++);
        }
    }
}
