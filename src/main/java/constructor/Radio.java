package constructor;


public class Radio {



    private int currentStation;
    private int maxStation = 10;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int currentStation, int maxStation, int minStation, int currentVolume, int maxVolume, int minVolume) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
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
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        return currentStation;
    }

    public int findVolume(int currentVolume) {

        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

    public int increaseStationNumber() {
        currentStation += 1;
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        return currentStation;
    }

    public int decreaseStationNumber() {
        currentStation -= 1;
        if (currentStation < minStation) {
            currentStation = maxStation;
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


