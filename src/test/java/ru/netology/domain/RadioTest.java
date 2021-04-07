package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.record.RecordMetaData;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void showStationWhenClickNext() {
        Radio radio = new Radio();
        int station = 10;
        int actual = (int) radio.findCurrentStation(station);
        assertEquals(0, actual);
        //assertEquals(0, radio.findCurrentStation(radio.setCurrentStation(10)));
    }

    @Test
    public void showStationWhenClickPrev() {
        Radio radio = new Radio();
        int station = -1;
        int actual = (int) radio.findCurrentStation(station);
        assertEquals(9, actual);
        // assertEquals(9, radio.findCurrentStation(radio.setCurrentStation(-1)));
    }

    @Test
    public void showCurrentStation() {
        Radio radio = new Radio();
        int expected = 5;
        radio.setCurrentStation(expected);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldNotChangeVolumeWhenPressPlus() {
        Radio radio = new Radio();
        assertEquals(10, radio.findVolume(radio.setVolume(11)));
    }

    @Test
    public void shouldNotChangeVolumeWhenPressMinus() {
        Radio radio = new Radio();
        assertEquals(0, radio.findVolume(radio.setVolume(-1)));
    }

    @Test
    public void showCurrentVolume() {
        Radio radio = new Radio();
        int expected = 6;
        radio.setVolume(expected);
        assertEquals(6, radio.getVolume());
    }

    @Test
    public void shouldIncreaseStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int actual = radio.increaseStationNumber();
        assertEquals(8, actual);
    }

    @Test
    public void increaseStationNumberIfMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int actual = radio.increaseStationNumber();
        assertEquals(0, actual);
    }

    @Test
    public void shouldDecreaseStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int actual = radio.decreaseStationNumber();
        assertEquals(7, actual);
    }

    @Test
    public void decreaseStationNumberIfMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int actual = radio.decreaseStationNumber();
        assertEquals(9, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int actual = radio.increaseVolume();
        assertEquals(1, actual);
    }

    @Test
    public void increaseVolumeIfMax() {
        Radio radio = new Radio();
        radio.setVolume(10);
        int actual = radio.increaseVolume();
        assertEquals(10, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(8);
        int actual = radio.decreaseVolume();
        assertEquals(7, actual);
    }

    @Test
    public void decreaseVolumeIfMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        int actual = radio.decreaseVolume();
        assertEquals(0, actual);
    }
}