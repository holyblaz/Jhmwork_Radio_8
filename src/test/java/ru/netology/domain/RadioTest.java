package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void shouldSetCurrentRadioStationBackIfStIsUnderMin() {
        Radio radio = new Radio(10, 10, 55, 100);
        int currentRadioStation = -1;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 10;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationBackIfStIsMoreThanMax() {
        Radio radio = new Radio(10, 10, 55, 100);
        int currentRadioStation = 11;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 10;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetActualRadioStation() {
        Radio radio = new Radio(10, 10, 55, 100);
        int currentRadioStation = 4;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 4;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotChangeSetRadioStationIfStationIsMax() {
        Radio radio = new Radio(10, 10, 55, 100);
        int currentRadioStation = 10;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnPrevRadioStationIfStationIsMin() {
        Radio radio = new Radio(10, 10, 55, 100);
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevStation();
        int expected = 10;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnNextStation() {
        Radio radio = new Radio(10, 10, 55, 100);
        int currentRadioStation = 5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextStation();
        int expected = 6;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnPrevStation() {
        Radio radio = new Radio(10, 10, 55, 100);
        int currentRadioStation = 4;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevStation();
        int expected = 3;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetVolumeIfVolumeIsUnderMin() {
        Radio radio = new Radio(10, 10, 0, 100);
        int volume = -1;
        radio.setVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsOverMax() {
        Radio radio = new Radio(10, 10, 100, 100);
        int volume = 101;
        radio.setVolume(volume);
        int expected = 100;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        Radio radio = new Radio(10, 10, 55, 100);
        int volume = 100;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 100;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio(10, 10, 55, 100);
        int volume = 0;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldChangeVolumeUpForOne() {
        Radio radio = new Radio(10, 10, 55, 100);
        int volume = 4;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 5;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldChangeVolumeDownForOne() {
        Radio radio = new Radio(10, 10, 55, 100);
        int volume = 9;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 8;
        assertEquals(expected, radio.getVolume());
    }
}
