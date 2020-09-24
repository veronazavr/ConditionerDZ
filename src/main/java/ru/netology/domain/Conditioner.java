package ru.netology.domain;

public class Conditioner {
        private String name;
        private int maxTemperature = 25;
        private int minTemperature = 0;
        private int currentTemperature = 18;
        private boolean on;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setCurrentTemperature(int currentTemperature) {
                if (currentTemperature < maxTemperature) {
                        return;
                }
                if (currentTemperature > minTemperature) {
                        return;
                }
                this.currentTemperature = currentTemperature;
        }
        public void increaseCurrentTemperature() {
                int currentTemperature = this.currentTemperature;
                if (currentTemperature >= maxTemperature) {
                        return;
                }
                this.currentTemperature = currentTemperature + 1;
        }
        public void decreaseCurrentTemperature(){
                int currentTemperature = this.currentTemperature;
                if (currentTemperature <= minTemperature) {
                        return;
                }
                this.currentTemperature = currentTemperature - 1;
        }
        public void decreaseCurrentTemperatureTest(){
                int currentTemperature = this.currentTemperature;
                if (currentTemperature < minTemperature) {
                        return;
                }
                this.currentTemperature = currentTemperature - 5;
        }


}
