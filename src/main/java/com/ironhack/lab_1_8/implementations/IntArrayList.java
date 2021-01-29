package com.ironhack.lab_1_8.implementations;

import com.ironhack.lab_1_8.interfaces.IntList;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private int size;
    private int[] intArray;
    int position;

    public IntArrayList() {
        this.size = 10;
        this.intArray = new int [size];
        this.position = 0;
    }

    public void add(int number) {
        if (position > size - 1){
            int newSize = (int) Math.round(size*1.5);
            this.size = newSize;
            this.intArray = Arrays.copyOf(intArray,newSize);
            intArray[this.position++] = number;
        } else {
            intArray[this.position++] = number;
        }
    }

    public int get(int id) {
        return intArray[id];
    }
}
