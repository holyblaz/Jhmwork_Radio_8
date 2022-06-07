package ru.netology.domain;

public class Radio {
    private int amountOfSt;
    private int currentRadioStation;
    private int minRadioStation;
    private int maxRadioStation;
    private int volume;
    private int minVolume;
    private int maxVolume = 100;


    public Radio(int amountOfSt) {
        this.amountOfSt = amountOfSt;
        this.currentRadioStation = currentRadioStation;
        this.maxRadioStation = amountOfSt - 1;
    }

    public Radio() {
        this.amountOfSt = 10;
        this.currentRadioStation = currentRadioStation;
        this.maxRadioStation = amountOfSt - 1;
    }

    public int getAmountOfSt() {
        return amountOfSt;
    }

    public void setAmountOfSt(int amountOfSt) {
        this.amountOfSt = amountOfSt;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation++;
    }

    public void prevStation() {
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation--;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume) {
            return;
        }
        if (volume > maxVolume) {
            return;
        }
        this.volume = volume;
    }

    public void volumeUpForOne() {
        if (volume == maxVolume) {
            this.volume = volume;
        }
        if (volume < maxVolume) {
            this.volume++;
        }
    }

    public void volumeDownForOne() {
        if (volume == minVolume) {
            this.volume = volume;
        }
        if (volume > minVolume) {
            this.volume--;
        }
    }
}

