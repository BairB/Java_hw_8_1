package ru.netology.domain;

public class Radio {


    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

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

    //    public int getCurrentStation() {
//        return currentStation;
//    }
//
//    public int setCurrentStation(int currentStation) {
//        this.currentStation = currentStation;
//        return currentStation;
//    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
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

    public int increaseStationNumber() {
        currentStation += 1;
        if (currentStation > maxStation) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int decreaseStationNumber() {
        currentStation -= 1;
        if (currentStation < minStation) {
            currentStation = 9;
        }
        return currentStation;
    }

    public int increaseVolume() {
        currentVolume += 1;
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        currentVolume -= 1;
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        return currentVolume;
    }
}


