package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(18);
        conditioner.increaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }
    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(18);
        conditioner.decreaseCurrentTemperature();
        assertEquals(17, conditioner.getCurrentTemperature());
    }
}
