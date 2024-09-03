package com.epam.conditions;

import java.util.logging.Logger;

public class CoordinatePane {

    private static final Logger logger = Logger.getLogger(CoordinatePane.class.getName());
    public void printQuadrant(int x, int y) {
        String str = "";
        if (x > 0 && y > 0) {
            str = "first";
        } else if (x < 0 && y > 0) {
            str = "second";
        } else if (x < 0 && y < 0) {
            str = "third";
        } else if (x > 0 && y < 0) {
            str = "fourth";
        } else if (x == 0 && y == 0) {
            str = "zero";
        }
        logger.info(str);
        System.out.println(str);
    }
}

