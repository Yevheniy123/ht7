package com.company;
import com.company.Collection;
import java.util.Arrays;
public class Main {
public static void main(String[] args) {
        task();

        }
private static void task() {
        System.out.println("\n--------------------------------------------\n");
        Collection collection1 = new Collection();
        System.out.println("Initial state of collection: " + collection1);

        collection1.add(555);
        collection1.add(555);
        collection1.add(333);
        collection1.add(555);
        collection1.add(555);
        System.out.println("Collection after adding elements: " + collection1);

        collection1.addAt(777, 20);
        System.out.println("After inserting the value at specific position (by index): " + collection1);

        collection1.removeAt(2);
        System.out.println("After deleting an element: " + collection1);

        System.out.println("Getting copy of part of collection: " + Arrays.toString(collection1.getCopy(1, 2)));

        System.out.println("Getting collection element at specific position (by index): " + collection1.getElementAt(4));

        collection1.addAt(333, 3);
        System.out.println("Collection after adding value at specific position (by index): " + collection1);

        System.out.println("Find of the first position in collection of the value '555': " + collection1.findFirst(555));
        System.out.println("Find of the last position in collection of the value '555': " + collection1.findLast(555));
        System.out.println("Find of the last position in collection of the value '444': " + collection1.findLast(444));

        Collection collection2 = new Collection();
        collection2.add(555);
        collection2.add(556);
        collection2.add(555);
        collection2.add(333);
        collection2.add(555);
        collection2.add(777);

        System.out.println("First collection: " + collection1);
        System.out.println("Second collection (dfferent object, the same values): " + collection2);
        System.out.println("Self compare: " + collection1.equals(collection1));
        System.out.println("Compare of two collections: " + collection1.equals(collection2));
        }
        }
