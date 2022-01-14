package Exercise.IteratorAndComparators.ListyIterator_01;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {
    private List<String> data;
    private int index;

    public ListyIterator(List<String> data) {
        this.data = data;
        if (this.data.isEmpty()) {
            index = -1;
        } else {
            index = 0;
        }
    }

    public boolean move() {
        if (hasNext()) {
            index++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        return index < data.size() - 1;
    }

    public void print() throws Exception {
        if (data.size() == 0) {
            throw new Exception("Invalid operation!");
        } else {
            System.out.println(data.get(index));
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return this.index < data.size() - 1;
            }

            @Override
            public String next() {
                return data.get(this.index++);
            }
        };
    }
    public void printAll(){
        for (String datum : data) {
            System.out.print(datum+ " ");
        }
        System.out.println();
    }
}
