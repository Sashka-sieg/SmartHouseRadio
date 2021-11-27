package ru.netology.domain;

public class Radio {
    private String name = "Radio";
    private int currentStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxStation = 9;
    private int minStation = 0;
    private int numberStation = 10;
    private boolean on;


    public Radio(int maxStation, int numberStation) {
        this.maxStation = maxStation;
        this.numberStation = numberStation;
    }


    public Radio() {

    }

    // повышаем громкость
    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


    public void setNumberStation(int numberStation) {
        this.numberStation = numberStation;
    }


    // понижаем громкость
    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

    // повышаем радиостанцию
    public void increaceStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void decreaseStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        }
        currentStation--;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation = currentStation;
    }

}


