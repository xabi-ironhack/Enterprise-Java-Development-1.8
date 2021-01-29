package com.ironhack.lab_1_8.implementations;

import com.ironhack.lab_1_8.interfaces.IntList;

import java.util.Arrays;

public class IntVector implements IntList {

    private int size;
    private int[] intVector;
    int position;

    public IntVector() {
        this.size = 10;
        this.intVector = new int [size];
        this.position = 0;
    }

    public void add(int number) {
        if (position > size - 1){
            int newSize = size * 2;
            this.size = newSize;
            this.intVector = Arrays.copyOf(intVector,newSize);
        }
        intVector[this.position++] = number;
    }

    public int get(int id) {
        return intVector[id];
    }
}
