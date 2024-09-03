package com.epam.conditions;

import java.util.logging.Logger;

public class TriangleSidesValidator {
    private static final Logger logger = Logger.getLogger(TriangleSidesValidator.class.getName());

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if ((firstSide + secondSide > thirdSide) && (firstSide + thirdSide > secondSide)
                && (secondSide + thirdSide > firstSide)) {
            logger.info("this is a valid triangle");
            System.out.println("this is a valid triangle");
        } else {
            logger.info("it's not a triangle");
            System.out.println("it's not a triangle");
        }
    }

}
