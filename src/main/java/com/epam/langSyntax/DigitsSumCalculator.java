package com.epam.langSyntax;

public class DigitsSumCalculator {

    //private static final Logger logger = Logger.getLogger(DigitsSumCalculator.class.getName());
    public void calculateSum(int number) {
        String str = String.valueOf(number);
        String arrStr[] = str.split("");
        int sum = 0;
        for (int i = 0; i < arrStr.length; i++) {
            sum += Integer.valueOf(arrStr[i]);
        }
        //logger.info(String.valueOf(sum));
        System.out.println(sum);
    }
}
