package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void ShouldincreaseStation() {
        Radio coub = new Radio();
        coub.setCurrentStation(7);
        coub.increaceStation();
        assertEquals(8, coub.getCurrentStation());
    }

    @Test
    public void ShouldNoincreaseStation() {
        Radio coub = new Radio();
        coub.setCurrentStation(10);
        coub.increaceStation();
        assertEquals(0, coub.getCurrentStation());
    }

    @Test
    public void ShouldDeIncreaseStation() {
        Radio coub = new Radio();
        coub.setCurrentStation(7);
        coub.decreaseStation();
        assertEquals(6, coub.getCurrentStation());
    }

    @Test
    public void ShouldNoDeIncreaseStation() {
        Radio coub = new Radio();
        coub.setCurrentStation(13);
        coub.getCurrentStation();
        assertEquals(9, coub.getCurrentStation());
    }

    @Test
    public void ShouldNoDecreaseStationLowMinPrev() {
        Radio coub = new Radio();
        coub.setCurrentStation(-10);
        coub.decreaseStation();
        assertEquals(9, coub.getCurrentStation());
    }

    @Test
    public void ShouldIncreateStationValue() {
        Radio coub = new Radio();
        coub.setCurrentStation(15);
        coub.increaceStation();
        assertEquals(0, coub.getCurrentStation());
    }

    @Test
    public void ShouldDecreateStationValue() {
        Radio coub = new Radio();
        coub.setCurrentStation(15);
        coub.decreaseStation();
        assertEquals(8, coub.getCurrentStation());
    }

    @Test
    public void ShouldIncreaseVolume() {
        Radio coub = new Radio();
        coub.setCurrentVolume(0);
        coub.increaseVolume();
        assertEquals(1, coub.getCurrentVolume());
    }

    @Test
    public void ShoulIncreaseVolumeOverMax() {
        Radio coub = new Radio();
        coub.setCurrentVolume(12);
        coub.increaseVolume();
        assertEquals(10, coub.getCurrentVolume());
    }

    @Test
    public void ShouldDecreaseVolume() {
        Radio coub = new Radio();
        coub.setCurrentVolume(1);
        coub.decreaseVolume();
        assertEquals(0, coub.getCurrentVolume());
    }

    @Test
    public void ShouldDecreaseVolumeUnderMin() {
        Radio coub = new Radio();
        coub.setCurrentVolume(0);
        coub.decreaseVolume();
        assertEquals(0, coub.getCurrentVolume());

    }

    @Test
    public void ShouldDecreaseVolumeUnderMinus5() {
        Radio coub = new Radio();
        coub.setCurrentVolume(-5);
        coub.decreaseVolume();
        assertEquals(0, coub.getCurrentVolume());

    }

    @Test
    public void ShouldPutVolume10() {
        Radio coub = new Radio();
        coub.setCurrentVolume(10);
        coub.increaseVolume();
        assertEquals(10, coub.getCurrentVolume());
    }

    @Test
    public void ShouldPutVolumeMax() {
        Radio coub = new Radio();
        coub.setCurrentVolume(11);
        coub.increaseVolume();
        assertEquals(10, coub.getCurrentVolume());
    }

    @Test
    public void ShouldPutVolume0() {
        Radio coub = new Radio();
        coub.setCurrentVolume(0);
        coub.decreaseVolume();
        assertEquals(0, coub.getCurrentVolume());
    }

    @Test
    public void ShouldPutVolume1() {
        Radio coub = new Radio();
        coub.setCurrentVolume(1);

        assertEquals(1, coub.getCurrentVolume());
    }

    @Test
    public void ShouldSetCurrentsStation() {
        Radio coub = new Radio();
        coub.setCurrentStation(7);
        assertEquals(7, coub.getCurrentStation());
    }


    @Test
    public void ShouldIncreaseStationOverMax() {
        Radio coub = new Radio();
        coub.setCurrentStation(12);
        coub.getCurrentStation();
        assertEquals(9, coub.getCurrentStation());
    }

    @Test
    public void ShouldDecreateStationUnderMin() {
        Radio coub = new Radio();
        coub.setCurrentStation(0);
        assertEquals(0, coub.getCurrentStation());
    }
}



