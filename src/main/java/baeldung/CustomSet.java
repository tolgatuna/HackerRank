package baeldung;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class CustomSet<E> implements Set<E> {
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
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        internal = new Object[]{e};
        return true;
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = false;
        Object[] objects = new Object[size() - 1];
        int newArrayCounter = 0;
        for (int i = 0; i < size(); i++) {
            if (internal[i].equals(o)) {
                removed = true;
                continue;
            }
            objects[newArrayCounter++] = internal[i];
        }
        internal = objects;
        return removed;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        internal = new Object[]{};
    }
}
