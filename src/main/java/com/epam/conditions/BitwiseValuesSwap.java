package com.epam.conditions;

import java.util.logging.Logger;

public class BitwiseValuesSwap {

    private static final Logger logger = Logger.getLogger(BitwiseValuesSwap.class.getName());
    public void swap(int first, int second) {
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        logger.info(String.valueOf(first));
        logger.info(String.valueOf(second));
    }
}
