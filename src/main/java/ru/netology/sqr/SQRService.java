package ru.netology.sqr;

public class SQRService {
    public int calc(int minValue, int maxValue) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int checkedValue = i * i;
            if (checkedValue >= minValue) {
                if (checkedValue <= maxValue) {
                    counter++;
                }

            }
        }
        return counter;
    }
}
