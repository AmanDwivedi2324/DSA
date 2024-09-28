
// ===> ArrayList = non-contiguous memory allocation, size variable, contains objects.

// ===> Methods = Add, Get, Modify, Delete/Remove, Iterate.

// ===> ArrayList is an implemented class of list interface which is present in java.util package.

// ===> Syntax ==>     package java.util;
//                     class ArrayList implements List{
//                         //constructors
//                         //methods
//                     }

// ===> ArrayList is created on the basis of growable or resizable array. 

// Properties of ArrayList = 
// 1) --> ArrayList are index based DS. 
// 2) --> ArrayList can store different data types or heterogeneous data types. 
// 3) --> ArrayList can store duplicate values. 
// 4) --> ArrayList can store any number of null values. 
// 5) --> ArrayList follows the insertion order. 
// 6) --> ArrayList does not follows the sorting order. 
// 7) --> ArrayList are non-synchronized. 


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTutorial {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        //add elements 

        list.add(0);
        list.add(2);
        list.add(4);

        System.out.println(list);           // [0, 2, 4]


        //get elements

        int element1 = list.get(0);
        System.out.println(element1);           // 0
        int element2 = list.get(1);
        System.out.println(element2);          // 2
        int element3 = list.get(2);
        System.out.println(element3);            // 3


        //add element in between = add the element 

        list.add(2, 20);
        System.out.println(list);             // [0, 2, 20, 4]


        //set element = replace the element

        list.set(0, 100);
        System.out.println(list);           // [100, 2, 20, 4]


        //delete element = remove element at the given index

        list.remove(2);
        System.out.println(list);            // [100, 2, 4]


        //size = give the size of list

        int size = list.size();
        System.out.println(size);           // 3


        //iteration = using loops

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");        // 100 2 4 
        }
        System.out.println();

        //sorting = using sort method of collections

        Collections.sort(list);
        System.out.println(list);
    }
    
}
