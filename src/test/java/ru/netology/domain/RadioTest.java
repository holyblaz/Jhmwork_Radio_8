package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void shouldSetCurrentRadioStationBackIfStIsUnderMin() {
        Radio radio = new Radio(10, 9, 90);
        int currentRadioStation = -1;
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationBackIfStIsMoreThanMax() {
        Radio radio = new Radio(10, 10, 100);
        int currentRadioStation = 11;
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetActualRadioStation() {
        Radio radio = new Radio(10, 8, 100);
        int currentRadioStation = 8;
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotChangeSetRadioStationIfStationIsMax() {
        Radio radio = new Radio(10, 9, 100);
        int currentRadioStation = 9;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnPrevRadioStationIfStationIsMin() {
        Radio radio = new Radio(10, 0, 100);
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnNextStation() {
        Radio radio = new Radio(10, 5, 100);
        int currentRadioStation = 5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnPrevStation() {
        Radio radio = new Radio(10, 7, 100);
        int currentRadioStation = 7;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetVolumeIfVolumeIsUnderMin() {
        Radio radio = new Radio(10, 9, 0);
        int volume = -1;
        radio.setVolume(volume);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsOverMax() {
        Radio radio = new Radio(10, 9, 100);
        int volume = 101;
        radio.setVolume(volume);
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        Radio radio = new Radio(10, 9, 100);
        int volume = 100;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio(10, 9, 0);
        int volume = 0;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldChangeVolumeUpForOne() {
        Radio radio = new Radio(10, 9, 90);
        int volume = 90;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        ;
        assertEquals(91, radio.getVolume());
    }

    @Test
    void shouldChangeVolumeDownForOne() {
        Radio radio = new Radio(10, 9, 90);
        int volume = 90;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        assertEquals(89, radio.getVolume());
    }

    @Test
    void shouldSetDefaultAmountOfSt() {
        Radio radio = new Radio();
        int amountOfSt = 10;
        radio.setAmountOfSt(amountOfSt);
        assertEquals(10, radio.getAmountOfSt());
    }
}
