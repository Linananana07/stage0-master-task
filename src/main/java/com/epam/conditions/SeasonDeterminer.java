package com.epam.conditions;

import java.util.logging.Logger;

public class SeasonDeterminer {
    private static final Logger logger = Logger.getLogger(SeasonDeterminer.class.getName());

    public void tellTheSeason(int monthNumber) {
        String season;
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            season = "Winter";
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            season = "Spring";
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            season = "Summer";
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            season = "Autumn";
        } else {
            season = "Wrong month number";
        }
        logger.info(season);
        System.out.println(season);
    }

}
