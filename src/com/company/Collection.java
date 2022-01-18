package com.company;
import java.util.Arrays;
public class Collection {


    private int[] array;

    public Collection() {
        array = new int[0];
    }

    public Collection(int size) {
        array = new int[size];
    }


    public boolean add(int element) {
        this.array = Arrays.copyOf(this.array, this.array.length + 1);
        this.array[this.array.length - 1] = element;
        return true;
    }


    public boolean addAt(int element, int index) {
        if (index > this.array.length)
            this.add(element);
        else {
            this.array = Arrays.copyOf(this.array, this.array.length + 1);
            // 555 555 333 555 555 0
            for (int i = this.array.length - 1; i > index; i--) {
                this.array[i] = this.array[i - 1];
            }
            this.array[index] = element;
            //          777
            //          |
            // 555 555 333 555 555
            //
            // 555 555 777 333 555 555

        }
        return true;
    }


    public boolean removeAt(int index) {
        if (index > this.array.length)
            return false;
        else {
            for (int i = index; i < this.array.length - 1; i++) {
                this.array[i] = this.array[i + 1];
            }
            this.array = Arrays.copyOf(this.array, this.array.length - 1);
        }
        return true;
    }


    public void clear() {
        this.array = new int[0];
    }


    public int getSize() {
        return this.array.length;
    }


    public boolean isPresent(int value) {
        for (int element : this.array) {
            if (element == value)
                return true;
        }

        return false;
    }


    public int[] getCopy(int start, int end) {
        // 555 555 777 333 555 555
        //          2       4
        int n = Math.abs(end - start);
        if (start > this.array.length || end > this.array.length)
            return new int[0];

        int[] tempArray = new int[n + 1];
        int k = 0;
        for (int i = (start < end ? start : end); i <= (end > start ? end : start); i++) {
            tempArray[k++] = this.array[i];
        }

        return tempArray;
    }


    public int getElementAt(int index) {
        if (index > this.array.length)
            return 0;
        return this.array[index];
    }


    public int findFirst(int value) {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == value)
                return i;
        }

        return -1;
    }


    public int findLast(int value) {
        for (int i = this.array.length - 1; i >= 0; i--) {
            if (this.array[i] == value)
                return i;
        }

        return -1;
    }


    public boolean equals(Object obj) {
        if (super.equals(obj))
            return true;

        if (this.array.length != ((Collection) obj).array.length)
            return false;
        else {
            for (int i = 0; i < this.array.length; i++) {
                if (this.array[i] != ((Collection) obj).array[i])
                    return false;
            }
        }

        return true;
    }


    public String toString() {
        String result = "\n{ ";

        for (int element : this.array) {
            result += element + ", ";
        }

        result = result.substring(0, result.length() - 2);

        result += " }";

        return result;
    }
}
