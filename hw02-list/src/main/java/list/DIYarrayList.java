package list;

import java.util.*;

public class DIYarrayList<T> implements List<T> {

    private Object[] array;
    private int size;

    DIYarrayList(int size) {
        this.array = new Object[size];
        this.size = size;
    }

    DIYarrayList() {
        this.array = new Object[10];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.array.length == 0;
    }

    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    public Iterator<T> iterator() {
        return new DIYarrayListIterator<>(this);
    }

    public Object[] toArray() {
        return this.array;
    }

    public boolean add(T item) {

        if (this.array.length > this.size) {
            this.array[this.size] = item;
            this.size++;
            return true;
        }

        Object[] newArray = new Object[this.array.length + 10];

        System.arraycopy(this.array, 0, newArray, 0, this.array.length);
        newArray[this.array.length] = item;

        this.array = newArray;
        this.size++;
        return true;
    }

    public boolean remove(Object o) {

        int foundIndex = this.indexOf(o);

        if (foundIndex == -1)
            return false;

        this.remove(foundIndex);
        return true;
    }

    public boolean addAll(Collection c) {

        if (this.array.length > this.size + c.size()) {
            for (Object item : c) {
                this.array[this.size] = item;
                this.size++;
            }
            this.size += c.size();
            return true;
        }


        int size = this.array.length + c.size();
        Object[] newArray = new Object[size];
        System.arraycopy(this.array, 0, newArray, 0, this.array.length);


        for (Object item : c) {
            newArray[this.size] = item;
        }

        this.array = newArray;
        this.size += c.size();
        return true;
    }

    public boolean addAll(int index, Collection c) {


        int newListSize = this.array.length > this.size + c.size() ? this.array.length : this.size + c.size();
        Object[] newArray = new Object[newListSize + 10];


        System.arraycopy(this.array, 0, newArray, 0, index);
        System.arraycopy(c.toArray(), 0, newArray, index, c.size());
        System.arraycopy(this.array, index, newArray, index + c.size(), this.array.length - (index + 1));


        this.array = newArray;
        this.size = newListSize;

        return true;
    }

    public void clear() {
        this.array = new Object[10];
        this.size = 0;
    }

    public T get(int index) {

        if (index > this.array.length || index < 0) {
            return null;
        }

        return (T) this.array[index];
    }

    public T set(int index, T item) {
        if (index > this.array.length || index < 0) {
            return null;
        }

        this.array[index] = item;
        return item;
    }

    public void add(int index, T item) {
        this.set(index, item);
    }

    public T remove(int index) {

        if (index > this.array.length - 1)
            return null;

        Object[] newList = new Object[this.array.length - 1];

        T removeditem = (T) this.array[index];

        System.arraycopy(this.array, 0, newList, 0, index);
        System.arraycopy(this.array, index + 1, newList, index, this.size - (index + 1));

        this.array = newList;
        this.size--;
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

        DIYarrayList<T> list = new DIYarrayList<>();

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
        return (T[]) this.array;
    }
}
