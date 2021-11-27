package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio coub = new Radio();

    @Test
    void ShouldincreaseStation() {
        coub.setCurrentStation(8);
        coub.increaceStation();
        assertEquals(9, coub.getCurrentStation());
    }

    @Test
    void ShouldNoincreaseStation() {
        coub.setCurrentStation(9);
        coub.increaceStation();
        assertEquals(0, coub.getCurrentStation());
    }

    @Test
    void ShouldDeIncreaseStation() {
        coub.setCurrentStation(9);
        coub.decreaseStation();
        assertEquals(8, coub.getCurrentStation());
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
    void ShouldNumberStation177() {
        coub.setNumberStation(177);
        assertEquals(9, coub.getMaxStation());
    }

    @Test
    public void CheckGetAndSetField() {
        coub.setName(coub.getName());
        assertEquals("Radio", coub.getName());
    }

    @Test
    void ShouldNumberStation11() {
        coub.setNumberStation(11);
        assertEquals(9, coub.getMaxStation());
    }

    @Test
    void ShouldNumberStation12() {
        coub.setCurrentStation(12);
        assertEquals(9, coub.getCurrentStation());
    }

    @Test
    void ShouldDecreaseVolume100() {
        coub.setCurrentVolume(100);
        coub.decreaseVolume();
        assertEquals(99, coub.getCurrentVolume());
    }

    @Test
    void ShouldPutVolum81() {
        coub.setCurrentVolume(81);

        assertEquals(81, coub.getCurrentVolume());
    }

    @Test
    void ShouldPutVolum100() {
        coub.setCurrentVolume(100);

        assertEquals(100, coub.getCurrentVolume());
    }

    @Test
    void ShouldPutVolum101() {
        coub.setCurrentVolume(101);

        assertEquals(100, coub.getCurrentVolume());
    }

    @Test
    void ShouldPutVolum99() {
        coub.setCurrentVolume(99);

        assertEquals(99, coub.getCurrentVolume());
    }

    @Test
    void ShouldIncreaseVolume100() {
        coub.setCurrentVolume(100);
        coub.increaseVolume();
        assertEquals(100, coub.getCurrentVolume());
    }

    @Test
    void ShouldDecreaseVolumeMinus1() {
        coub.setCurrentVolume(-1);
        coub.decreaseVolume();
        assertEquals(0, coub.getCurrentVolume());
    }


}



