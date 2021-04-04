package ru.netology.domain;

public class Radio {
    private int currentStation;
    int maxStation = 9;
    int minStation = 0;
    private int currentVolume;
    int maxVolume = 10;
    int minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
        return currentStation;
    }

    public int getVolume() {
        return currentVolume;
    }

    public int setVolume(int volume) {
        this.currentVolume = volume;
        return volume;
    }


    public int findCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = 0;
        }
        if (currentStation < minStation) {
            currentStation = 9;
        }
        return currentStation;
    }

    public int findVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = 10;
        }
        if (currentVolume < minVolume) {
            currentVolume = 0;
        }
        return currentVolume;
    }
}


