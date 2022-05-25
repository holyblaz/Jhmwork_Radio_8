package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void shouldSetCurrentRadioStation () {
        Radio radio = new Radio();
        int currentRadioStation = -1;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationToZero() {
        Radio radio = new Radio();
        int currentRadioStation = 10;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetActualRadioStation() {
        Radio radio = new Radio();
        int currentRadioStation = 4;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 4;
        assertEquals(expected, radio.getCurrentRadioStation());
    }
    @Test
    void shouldNotChangeSetRadioStationIfStationIsMax() {
        Radio radio = new Radio();
        int currentRadioStation = 9;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnPrevRadioStationIfStationIsMin() {
        Radio radio = new Radio();
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }
    @Test
    void shouldChangeOnNextStation() {
        Radio radio = new Radio();
        int currentRadioStation = 5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextStation();
        int expected = 6;
        assertEquals(expected, radio.getCurrentRadioStation());
    }
    @Test
    void shouldChangeOnPrevStation() {
        Radio radio = new Radio();
        int currentRadioStation = 4;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevStation();
        int expected = 3;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetVolumeIfVolumeIsUnderMin() {
        Radio radio = new Radio();
        int volume = -1;
        radio.setVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsOverMax() {
        Radio radio = new Radio();
        int volume = 11;
        radio.setVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        Radio radio = new Radio();
        int volume = 10;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 10;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio();
        int volume = 0;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }
    @Test
    void shouldChangeVolumeUpForOne() {
        Radio radio = new Radio();
        int volume = 4;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 5;
        assertEquals(expected, radio.getVolume());
    }
    @Test
    void shouldChangeVolumeDownForOne() {
        Radio radio = new Radio();
        int volume = 9;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 8;
        assertEquals(expected, radio.getVolume());
    }
}
