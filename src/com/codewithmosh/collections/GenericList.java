package com.codewithmosh.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenericList<T> implements Iterable<T> {
    final private ArrayList<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public T get(int index) {
        return items.get(index);
    }


    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<T>{
        private int currentPosition;

        @Override
        public boolean hasNext() {
            return currentPosition < items.size();
        }

        @Override
        public T next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            return get(currentPosition++);
        }
    }
}
