package com.epam.conditions;

import java.util.logging.Logger;

public class BitwiseValuesSwap {

    private static final Logger logger = Logger.getLogger(BitwiseValuesSwap.class.getName());
    public void swap(int first, int second) {
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        int finalFirst = first;
        logger.info(() -> String.format("First: %d", finalFirst));
        int finalSecond = second;
        logger.info(() -> String.format("Second: %d", finalSecond));
        System.out.println(first);
        System.out.println(second);
    }
}
