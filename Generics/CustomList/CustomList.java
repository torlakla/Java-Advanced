package Exercise.Generics.CustomList_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {
    public List<T> getElements() {
        return elements;
    }

    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);

    }

    public void remove(int index) {
        this.elements.remove(index);
    }

    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        T tempElement = this.elements.get(firstIndex);
        this.elements.set(firstIndex, this.elements.get(secondIndex));
        this.elements.set(secondIndex, tempElement);
    }

    public int countGreaterThan(T element) {
        return (int) this.elements.stream().filter(e -> e.compareTo(element) > 0).count();

    }

    public T getMax() {
        return this.elements.stream().max((a, b) -> a.compareTo(b)).get();
    }

    public T getMin() {
        return this.elements.stream().min((a, b) -> a.compareTo(b)).get();
    }

    public void print() {
        for (T element : elements) {
            System.out.println(element);

        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<elements.size();
            }

            @Override
            public T next() {
                return elements.get(index++);
            }
        };
    }
}

