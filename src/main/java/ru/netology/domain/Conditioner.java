package ru.netology.domain;

public class Conditioner {
        private String name;
        private int maxTemperature = 25;
        private int minTemperature = 10;
        private int currentTemperature = 18;
        private boolean on;

        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        public int getMaxTemperature() {
                return maxTemperature;
        }
        public void setMaxTemperature(int maxTemperature) {
                this.maxTemperature = maxTemperature;
        }
        public int getMinTemperature() {
                return minTemperature;
        }
        public void setMinTemperature(int minTemperature) {
                this.minTemperature = minTemperature;
        }
        public int getCurrentTemperature() {
                return currentTemperature;
        }
        public void setCurrentTemperature(int currentTemperature) {
                if (currentTemperature <= maxTemperature) {
                        return;
                }
                if (currentTemperature >= minTemperature) {
                        return;
                }
                this.currentTemperature = currentTemperature;
        }
        public void increaseCurrentTemperature() {
                int currentTemperature = this.currentTemperature;
                if (currentTemperature == maxTemperature) {
                        return;
                }
                this.currentTemperature = currentTemperature + 1;
        }
        public void decreaseCurrentTemperature(){
                int currentTemperature = this.currentTemperature;
                if (currentTemperature == minTemperature) {
                        return;
                }
                this.currentTemperature = currentTemperature - 1;
        }

        public boolean isOn() {
                return on;
        }

        public void setOn(boolean on) {
                this.on = on;
        }
}
