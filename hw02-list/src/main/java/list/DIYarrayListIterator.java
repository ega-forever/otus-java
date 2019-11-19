package list;

import java.util.ListIterator;

public class DIYarrayListIterator<T> implements ListIterator<T> {

    private DIYarrayList<T> list;
    private int index = -1;

    DIYarrayListIterator(DIYarrayList<T> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return this.list.validateIndexInRange(this.index + 1);
    }

    public T next() {
        if (!this.list.validateIndexInRange(this.index + 1)) {
            return null;
        }

        this.index++;
        return this.list.get(this.index);
    }

    public boolean hasPrevious() {
        return this.list.validateIndexInRange(this.index - 1);
    }

    public T previous() {
        if (!this.list.validateIndexInRange(this.index - 1)) {
            return null;
        }
        this.index--;
        return this.list.get(this.index);
    }

    public int nextIndex() {
        if (!this.list.validateIndexInRange(this.index + 1))
            return -1;

        return this.index + 1;
    }

    public int previousIndex() {
        if (!this.list.validateIndexInRange(this.index - 1))
            return -1;

        return this.index - 1;
    }

    public void remove() {
        this.list.remove(this.index);

    }

    public void set(T item) {
        this.list.set(this.index, item);
    }

    public void add(T item) {
        this.list.add(this.index, item);
    }
}
