package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void ShouldincreaseStation() {
        Radio coub = new Radio();
        coub.currentStation = 9;
        int expected = 0;
        coub.increaseStation();
        int actual = coub.currentStation;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldNoIncreaseStation() {
        Radio coub = new Radio();
        coub.currentStation = 11;
        int expected = 11;
        coub.increaseStation();
        int actual = coub.currentStation;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldNoDeIncreaseStation() {
        Radio coub = new Radio();
        coub.currentStation = 11;
        int expected = 11;
        coub.increaseStation();
        int actual = coub.currentStation;
        assertEquals(expected, actual);

    }

    @Test
    public void ShouldDeIncreaseStation() {
        Radio coub = new Radio();
        coub.currentStation = 8;
        int expected = 7;
        coub.decreaseStation();
        int actual = coub.currentStation;
        assertEquals(expected, actual);
    }


    @Test
    public void ShouldNoDecreaseStationLowMinPrev() {
        Radio coub = new Radio();
        coub.currentStation = -1;
        int expected = 9;
        coub.decreaseStation();
        int actual = coub.currentStation;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldPutStation9() {
        Radio coub = new Radio();
        coub.currentStation = 0;
        int expected = 9;
        coub.decreaseStation();
        int actual = coub.currentStation;
        assertEquals(expected, actual);
    }

//    @Test
//public void ShouldPutStationMax() {
//        Radio coub = new Radio();
//        coub.currentStation = 9;
//       int expected = 9;
//       coub.increaseStation();
//       int actual = coub.currentStation;
//        assertEquals(expected, actual);
//  }

    @Test
    public void ShouldIncreaseVolume() {
        Radio coub = new Radio();
        coub.currentVolume = 6;
        int expected = 7;
        coub.increaseVolume();
        int actual = coub.currentVolume;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldNoIncreaseVolume() {
        Radio coub = new Radio();
        coub.currentVolume = 10;
        int expected = 10;
        coub.increaseVolume();
        int actual = coub.currentVolume;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldDecreaseVolume() {
        Radio coub = new Radio();
        coub.currentVolume = 8;
        int expected = 7;
        coub.decreaseVolume();
        int actual = coub.currentVolume;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldNoDecreaseVolume() {
        Radio coub = new Radio();
        coub.currentVolume = -1;
        int expected = 0;
        coub.decreaseVolume();
        int actual = coub.currentVolume;
        assertEquals(expected, actual);

    }

    @Test
    public void ShouldPutVolume10() {
        Radio coub = new Radio();
        coub.currentVolume = 10;
        int expected = 10;
        coub.increaseVolume();
        int actual = coub.currentVolume;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldPutVolumeMax() {
        Radio coub = new Radio();
        coub.currentVolume = 11;
        int expected = 10;
        coub.increaseVolume();
        int actual = coub.currentVolume;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldPutVolume0() {
        Radio coub = new Radio();
        coub.currentVolume = 0;
        int expected = 0;
        coub.decreaseVolume();
        int actual = coub.currentVolume;
        assertEquals(expected, actual);
    }

//    @Test
//    public void ShouldPutVolumeMin1() {
//        Radio coub = new Radio();
//        coub.currentVolume = 1;
//       int expected = 1;
//        coub.decreaseVolume();
//        int actual = coub.currentVolume;
//        assertEquals(expected, actual);
//    }

    @Test
    public void ShouldSetCurrentsStation() {
        Radio coub = new Radio();
        coub.setCurrentStation(5);
        assertEquals(5, coub.getCurrentStation());
    }

    @Test
    public void ShouldNoSetCurrentsStationMin() {
        Radio coub = new Radio();
        coub.setCurrentStation(6);
        coub.setCurrentStation(-3);
        assertEquals(6, coub.getCurrentStation());
    }

    @Test
    public void ShouldNoSetCurrentsStationMax() {
        Radio coub = new Radio();
        coub.setCurrentStation(6);
        coub.setCurrentStation(11);
        assertEquals(6, coub.getCurrentStation());
    }
}


