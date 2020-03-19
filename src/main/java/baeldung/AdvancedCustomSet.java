package baeldung;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class AdvancedCustomSet<E> implements Set<E> {
    private Object[] internal;
    private int lastIndex = -1;

    public AdvancedCustomSet() {
        internal = new Object[10];
    }

    public AdvancedCustomSet(int length) {
        internal = new Object[length];
    }

    @Override
    public int size() {
        return lastIndex + 1;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object value : internal) {
            if (o == value) {
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
        if (contains(e)) {
            return false;
        } else {
            if (lastIndex + 1 > internal.length * 0.5) {
                Object[] largerInternal = new Object[internal.length * 2];
                System.arraycopy(internal, 0, largerInternal, 0, size());
                internal = largerInternal;
            }
            internal[++lastIndex] = e;
            return true;
        }
    }

    @Override
    public boolean remove(Object o) {
        int deleteIndex = -1;
        for (int i = 0; i < internal.length; i++) {
            if (o == internal[i]) {
                lastIndex--;
                deleteIndex = i;
                break;
            }
        }

        if (deleteIndex != -1) {
            if (internal.length - 1 - deleteIndex >= 0)
                System.arraycopy(internal, deleteIndex + 1, internal, deleteIndex, internal.length - 1 - deleteIndex);
            return true;
        }

        return false;
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
        int length = internal.length;
        internal = new Object[length];
        lastIndex = -1;
    }
}
