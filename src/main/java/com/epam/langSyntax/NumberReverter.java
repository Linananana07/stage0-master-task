package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String string = String.valueOf(number);
        String reverdString = new StringBuilder(string).reverse().toString();

        System.out.println(reverdString);
    }

}
