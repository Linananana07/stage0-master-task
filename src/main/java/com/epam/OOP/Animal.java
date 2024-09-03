package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This animal is mostly ").append(color).append(". It has ").append(numberOfPaws);
        if (numberOfPaws > 1) {
            stringBuilder.append(" paws and");
        } else {
            stringBuilder.append(" paw and");
        }

        if (hasFur) {
            stringBuilder.append(" a fur.");
        } else {
            stringBuilder.append(" no fur.");
        }

        return stringBuilder.toString();
    }
}
