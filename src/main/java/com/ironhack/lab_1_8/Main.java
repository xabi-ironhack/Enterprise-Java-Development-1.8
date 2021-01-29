package com.ironhack.lab_1_8;

import com.ironhack.lab_1_8.classes.BigDecimalExercises;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        System.out.println("---> Exercise 1");
        BigDecimal num = new BigDecimal("5.6789032");
        System.out.println(num + "converts to " + BigDecimalExercises.bigDecimalToDoubleRounded(num));

        System.out.println("---> Exercise 2");
        System.out.println(num + " se convierte en " + BigDecimalExercises.bigDecimalInvertedRounded(num));

    }
}

