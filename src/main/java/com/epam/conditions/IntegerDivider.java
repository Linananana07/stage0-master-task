package com.epam.conditions;

import java.util.logging.Logger;

public class IntegerDivider {

    private static final Logger logger = Logger.getLogger(IntegerDivider.class.getName());
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            logger.info("division by zero");
            System.out.println("division by zero");
        } else {
            int difference = dividend / divider;
            int multiplication = divider * difference;
            if (multiplication == dividend) {
                logger.info("can be divided completely");
                System.out.println("can be divided completely");
            } else {
                logger.info("cannot be divided completely");
                System.out.println("cannot be divided completely");
            }
        }
    }

}
