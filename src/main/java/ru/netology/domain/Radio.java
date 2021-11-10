package ru.netology.domain;

public class Radio {
    int currentStation;
    int currentVolume;

    public void increaseStation() {
        if (currentStation <= 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation == 10) {
            currentStation = 0;
        }
    }

    public void decreaseStation() {
        if (currentStation >= 0) {
            currentStation = currentStation - 1;}

                if (currentStation == -1) {
                    currentStation = 9;
                }
            }
        }