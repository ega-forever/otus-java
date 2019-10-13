package list;

import java.util.ListIterator;

public class DIYarrayListIterator<T> implements ListIterator<T> {

    private DIYarrayList<T> list;
    private int index = -1;

    DIYarrayListIterator(DIYarrayList<T> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return this.list.size() - 1 > index;
    }

    public T next() {
        this.index++;
        return this.list.get(this.index);
    }

    public boolean hasPrevious() {
        return this.index - 1 >= 0 && this.list.size() > 0;
    }

    public T previous() {
        if (this.index - 1 < 0 || this.list.size() == 0)
            return null;
        this.index--;
        return this.list.get(this.index);
    }

    public int nextIndex() {
        if (this.index == this.list.size() - 1)
            return -1;

        return this.index + 1;
    }

    public int previousIndex() {
        if (this.index == 0)
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
