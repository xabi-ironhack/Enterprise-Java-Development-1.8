package com.ironhack.lab_1_8.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExercises {

    public static double bigDecimalToDoubleRounded(BigDecimal number){
        return (number.setScale(2, RoundingMode.HALF_UP)).doubleValue();
    }

    public static BigDecimal bigDecimalInvertedRounded(BigDecimal number){
        return (number.setScale(1, RoundingMode.HALF_UP)).negate();
    }
}
