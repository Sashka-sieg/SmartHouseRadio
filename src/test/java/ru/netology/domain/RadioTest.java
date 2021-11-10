package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
   public void ShouldincreaseStation() {
        Radio coub = new Radio();
        coub.currentStation =8;
        int expected =9;
        coub.increaseStation();
        int actual =coub.currentStation;
        assertEquals(expected,actual);
    }

    @Test
     public void decreaseStation() {
    }
}