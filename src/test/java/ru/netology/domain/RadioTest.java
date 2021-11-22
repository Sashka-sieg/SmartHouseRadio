package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio coub = new Radio();

    @Test
    void ShouldincreaseStation() {
        coub.setCurrentStation(7);
        coub.increaceStation();
        assertEquals(8, coub.getCurrentStation());
    }

    @Test
    void ShouldNoincreaseStation() {
        coub.setCurrentStation(10);
        coub.increaceStation();
        assertEquals(0, coub.getCurrentStation());
    }

    @Test
    void ShouldDeIncreaseStation() {
        coub.setCurrentStation(7);
        coub.decreaseStation();
        assertEquals(6, coub.getCurrentStation());
    }

    @Test
    void ShouldNoDeIncreaseStation() {
        coub.setCurrentStation(13);
        assertEquals(9, coub.getCurrentStation());
    }

    @Test
    void ShouldNoDecreaseStationLowMinPrev() {
        coub.setCurrentStation(-10);
        coub.decreaseStation();
        assertEquals(9, coub.getCurrentStation());
    }

    @Test
    void ShouldIncreateStationValue() {
        coub.setCurrentStation(15);
        coub.increaceStation();
        assertEquals(0, coub.getCurrentStation());
    }

    @Test
    void ShouldDecreateStationValue() {
        coub.setCurrentStation(15);
        coub.decreaseStation();
        assertEquals(8, coub.getCurrentStation());
    }

    @Test
    void ShouldIncreaseVolume() {
        coub.setCurrentVolume(0);
        coub.increaseVolume();
        assertEquals(1, coub.getCurrentVolume());
    }

    @Test
    void ShoulIncreaseVolumeOverMax() {
        coub.setCurrentVolume(120);
        coub.increaseVolume();
        assertEquals(100, coub.getCurrentVolume());
    }

    @Test
    void ShouldDecreaseVolume() {
        coub.setCurrentVolume(1);
        coub.decreaseVolume();
        assertEquals(0, coub.getCurrentVolume());
    }

    @Test
    void ShouldDecreaseVolumeUnderMin() {
        coub.setCurrentVolume(0);
        coub.decreaseVolume();
        assertEquals(0, coub.getCurrentVolume());

    }

    @Test
    void ShouldDecreaseVolumeUnderMinus5() {
        coub.setCurrentVolume(-5);
        coub.decreaseVolume();
        assertEquals(0, coub.getCurrentVolume());

    }

    @Test
    void ShouldPutVolume100() {
        coub.setCurrentVolume(100);
        coub.increaseVolume();
        assertEquals(100, coub.getCurrentVolume());
    }

    @Test
    void ShouldPutVolumeMax() {
        coub.setCurrentVolume(101);
        coub.increaseVolume();
        assertEquals(100, coub.getCurrentVolume());
    }

    @Test
    void ShouldPutVolume0() {
        coub.setCurrentVolume(0);
        coub.decreaseVolume();
        assertEquals(0, coub.getCurrentVolume());
    }

    @Test
    void ShouldPutVolume1() {
        coub.setCurrentVolume(1);

        assertEquals(1, coub.getCurrentVolume());
    }

    @Test
    void ShouldSetCurrentsStation() {
        coub.setCurrentStation(7);
        assertEquals(7, coub.getCurrentStation());
    }


    @Test
    void ShouldIncreaseStationOverMax() {
        coub.setCurrentStation(12);
        assertEquals(9, coub.getCurrentStation());
    }

    @Test
    void ShouldDecreateStationUnderMin() {
        coub.setCurrentStation(0);
        assertEquals(0, coub.getCurrentStation());
    }

    @Test
    void ShouldNumberStation() {
        coub.setNumberStation(5);
        assertEquals(5, coub.getNumberStation());
    }

    @Test
    public void checkGetAndSetField() {
        coub.setName(coub.getName());
        assertEquals("Radio", coub.getName());
    }

}



