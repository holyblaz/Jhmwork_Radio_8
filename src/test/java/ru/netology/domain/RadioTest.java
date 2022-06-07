package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void shouldSetCurrentRadioStationBackIfStIsUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationBackIfStIsMoreThanMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetActualRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotChangeSetRadioStationIfStationIsMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnPrevRadioStationIfStationIsMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnNextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.prevStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetVolumeIfVolumeIsUnderMin() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsOverMax() {
        Radio radio = new Radio();
        radio.setVolume(101);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.volumeUpForOne();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.volumeDownForOne();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldChangeVolumeUpForOne() {
        Radio radio = new Radio();
        radio.setVolume(90);
        radio.volumeUpForOne();
        assertEquals(91, radio.getVolume());
    }

    @Test
    void shouldChangeVolumeDownForOne() {
        Radio radio = new Radio();
        radio.setVolume(90);
        radio.volumeDownForOne();
        assertEquals(89, radio.getVolume());
    }

    @Test
    void shouldNewAmountOfSt() {
        Radio radio = new Radio(33);
        radio.setAmountOfSt(33);
        assertEquals(33, radio.getAmountOfSt());
    }

    @Test
    void shouldSetCurrentStAndNewAmountOfSt() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(17);
        assertEquals(17, radio.getCurrentRadioStation());
    }
}