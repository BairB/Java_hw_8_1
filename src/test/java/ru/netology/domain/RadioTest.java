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
        int station = 7;
        int actual = radio.increaseStationNumber(station);
        assertEquals(8, actual);
        //  System.out.println(actual);
    }

    @Test
    public void increaseStationNumberIfMax() {
        Radio radio = new Radio();
        int station = 9;
        int actual = radio.increaseStationNumber(station);
        assertEquals(0, actual);
        //  System.out.println(actual);
    }

    @Test
    public void shouldDecreaseStationNumber() {
        Radio radio = new Radio();
        int station = 6;
        int actual = radio.decreaseStationNumber(station);
        assertEquals(5, actual);
        //System.out.println(actual);
    }

    @Test
    public void decreaseStationNumberIfMin() {
        Radio radio = new Radio();
        int station = 0;
        int actual = radio.decreaseStationNumber(station);
        assertEquals(9, actual);
        //System.out.println(actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        int volume = 5;
        int actual = radio.increaseVolume(volume);
        assertEquals(6, actual);
        //System.out.println(actual);
    }

    @Test
    public void increaseVolumeIfMax() {
        Radio radio = new Radio();
        int volume = 10;
        int actual = radio.increaseVolume(volume);
        assertEquals(10, actual);
        //System.out.println(actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        int volume = 8;
        int actual = radio.decreaseVolume(volume);
        assertEquals(7, actual);
        //System.out.println(actual);
    }

    @Test
    public void decreaseVolumeIfMin() {
        Radio radio = new Radio();
        int volume = 0;
        int actual = radio.decreaseVolume(volume);
        assertEquals(0, actual);
        //System.out.println(actual);
    }
}