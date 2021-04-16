package DemoTwo;

import java.util.ArrayList;

public class MyListTest  {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(10);
        myList.add(12);
        myList.add(22);
        myList.add(122);
        myList.add(123);
        myList.add(124);
        myList.add(124);
        myList.add(124);
        myList.add(124);
        myList.add(124);
        System.out.println("1 " + myList );
//        System.out.println(myList.remove(1));
//        System.out.println(myList.size());
//        System.out.println(myList.indexOf(22));
//        System.out.println(myList.contains(22));
        myList.ensureCapacity(15);
        System.out.println(myList);;


    }

}