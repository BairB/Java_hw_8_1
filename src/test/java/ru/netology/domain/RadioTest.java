package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.record.RecordMetaData;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void showStationWhenClickNext() {
        Radio radio = new Radio();
        assertEquals(0, radio.findCurrentStation(radio.setCurrentStation(10)));
    }

    @Test
    public void showStationWhenClickPrev() {
        Radio radio = new Radio();
        assertEquals(9, radio.findCurrentStation(radio.setCurrentStation(-1)));
    }

    @Test
    public void showCurrentStation() {
        Radio radio = new Radio();
        int expected = 5;
        radio.setCurrentStation(expected);
        assertEquals(5,radio.getCurrentStation());
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
    public void showCurrentVolume(){
        Radio radio = new Radio();
        int expected = 6;
        radio.setVolume(expected);
        assertEquals(6, radio.getVolume());
    }

}