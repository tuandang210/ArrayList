package DemoTwo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
      this.elements = new Object[size];
    }

    public MyList(int capacity) {
        this.elements = new Object[capacity];
    }

    void add(int index, E element) {
        Object[] newArray = new Object[elements.length + 1];

        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            System.arraycopy(elements, 0, newArray, 0, index);
            newArray[index] = element;
            System.arraycopy(elements, index , newArray, index+1, newArray.length - index -2 );
        }
        elements=newArray;
    }
    E remove(int index) {
        Object[] newArray = new Object[elements.length -1];
        Object[] newArrays = new Object[1];
//        for (Object a:elements){
//            System.out.println(a);
//        }
        if (index < 0 || index > elements.length-1) {
            throw new IndexOutOfBoundsException();
        } else {
            newArrays[0] = elements[index];
            System.arraycopy(elements, 0, newArray, 0, index);

            System.arraycopy(elements, index+1 , newArray, index, newArray.length - index -2 );
        }
        elements=newArray;
        return (E) newArrays[0];
    }

    int size() {
        return size;
    }

    public E clone() {
        return (E) elements;
    }

    boolean contains(E o) {
        return indexOf(o) > -1;
    }

    int indexOf(E o) {
//        for (Object a:elements){
//            System.out.println(a);
//        }
        for (int i=0;i<elements.length;i++){
//            System.out.println("11");
            if (o==(elements[i])){
                return i;
            }
        }
        return -1;
    }

    boolean add(E o) {
        elements[size()]=o;
        size++;
        return true;
    }
    void ensureCapacity(int minCapacity) {
        Object[] newArray = new Object[minCapacity];
        System.arraycopy(elements,0,newArray,0,elements.length);
        elements=newArray;
    }

    E get(int i) {
        return (E) elements[i];
    }

    void clear() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
