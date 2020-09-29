package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    Conditioner conditioner = new Conditioner();

    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";
        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void increaseCurrentTemperatureOk() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(18);
        conditioner.increaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureMaxLimit() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        assertEquals(25, conditioner.getCurrentTemperature());

    }

    @Test

    public void decreaseCurrentTemperatureOk() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(25);
        conditioner.decreaseCurrentTemperature();
        assertEquals(24, conditioner.getCurrentTemperature());
    }

    @Test

    public void decreaseCurrentTemperatureMinLinit() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(0);
        conditioner.decreaseCurrentTemperature();
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void setMaxTemperatureTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        assertEquals(25, conditioner.getMaxTemperature());
    }

    @Test
    public void setMinTemperatureTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0);
        assertEquals(0, conditioner.getMinTemperature());
    }
    @Test
    public void setCurrentTemperatureAboveMax(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(20);
        conditioner.setCurrentTemperature(60);
        assertEquals(20, conditioner.getCurrentTemperature());
    }

    @Test
    public void setCurrentTemperatureUnderMin(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(30);
        conditioner.setCurrentTemperature(3);
        assertEquals(3, conditioner.getCurrentTemperature());
    }

    @Test
    public void setOn(){
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        assertTrue(conditioner.isOn());
    }
}
