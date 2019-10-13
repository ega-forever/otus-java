import java.util.*;

public class DIYarrayList<T> implements List<T> {

    private T[] array;

    DIYarrayList(int size) {
        this.array = (T[]) new Object[size];
    }

    DIYarrayList() {
        this.array = (T[]) new Object[0];
    }

    public int size() {
        return this.array.length;
    }

    public boolean isEmpty() {
        return this.array.length == 0;
    }

    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    public Iterator<T> iterator() {
        return new DIYarrayListIterator<T>(this);
    }

    public Object[] toArray() {
        return this.array;
    }

    public boolean add(T item) {
        DIYarrayList<T> list = new DIYarrayList<T>(this.array.length + 1);
        Collections.copy(list, this);
        list.set(this.array.length, item);
        this.array = (T[]) list.toArray();
        return true;
    }

    public boolean remove(Object o) { // todo validate

        int foundIndex = this.indexOf(o);

        if (foundIndex == -1)
            return false;

        this.remove(foundIndex);
        return true;
    }

    public boolean addAll(Collection c) {

        DIYarrayList<T> newList = new DIYarrayList<T>(this.array.length + c.size());
        Collections.copy(newList, this);

        for (Object item : c) {
            newList.add((T) item);
        }

        this.array = (T[]) newList.toArray();
        return true;
    }

    public boolean addAll(int index, Collection c) {

        DIYarrayList<T> newList = new DIYarrayList<T>(this.array.length + c.size());
        for (int curIndex = 0; curIndex < index; curIndex++) {
            newList.add(this.get(curIndex));
        }

        for (Object item : c) {
            newList.add((T) item);
        }


        for (int curIndex = index; curIndex < this.array.length; curIndex++) {
            newList.add(this.get(curIndex));
        }

        return true;
    }

    public void clear() {
        this.array = (T[]) new Object[0];
    }

    public T get(int index) {

        if (index > this.array.length) {
            return null;
        }

        return this.array[index];
    }

    public T set(int index, T item) {
        this.array[index] = item;
        return item;
    }

    public void add(int index, T item) {
        this.set(index, item);
    }

    public T remove(int index) {

        if (index > this.array.length - 1)
            return null;

        DIYarrayList<T> newList = new DIYarrayList<T>(this.array.length - 1);
        for (int curIndex = 0; curIndex < index; curIndex++)
            newList.add(0, this.get(curIndex));

        for (int curIndex = index + 1; curIndex < this.array.length; curIndex++)
            newList.add(curIndex - 1, this.get(curIndex));

        T removeditem = this.array[index];

        this.array = (T[]) newList.toArray();

        return removeditem;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].equals(o)) {
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(Object o) {
        for (int i = this.array.length - 1; i >= 0; i--) {
            if (this.array[i].equals(o)) {
                return i;
            }
        }

        return -1;
    }

    public ListIterator<T> listIterator() {
        return new DIYarrayListIterator<T>(this);
    }

    public ListIterator<T> listIterator(int index) {
        return new DIYarrayListIterator<T>(this);
    }

    public List<T> subList(int fromIndex, int toIndex) {

        DIYarrayList<T> list = new DIYarrayList<T>();

        for (int index = fromIndex; index < toIndex; index++) {
            list.add(this.get(index));
        }

        return list;
    }

    public boolean retainAll(Collection c) { // todo
        return false;
    }

    public boolean removeAll(Collection c) { // todo
        return false;
    }

    public boolean containsAll(Collection c) { // todo
        return false;
    }

    public T[] toArray(Object[] a) { // todo
        return this.array;
    }
}
