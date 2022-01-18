package com.company;

public interface ICollection {
    boolean add(int element);
    boolean addAt(int element, int index);
    boolean removeAt(int index);
    void clear();
    int getSize();
    boolean isPresent(int value);
    int [] getCopy(int start, int end);
    int getElementAt(int index);
    int findFirst(int value);
    int findLast(int value);
}
